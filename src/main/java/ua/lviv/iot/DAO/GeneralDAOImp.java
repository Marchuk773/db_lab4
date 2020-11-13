package ua.lviv.iot.DAO;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.PrimaryKey;
import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.persistant.ConnectionManager;
import ua.lviv.iot.transformer.Transformer;

public abstract class GeneralDAOImp<T, ID> implements GeneralDAO<T, ID> {

    private final Class<T> currentClass;
    private static final String findAllTemplate = "SELECT * FROM tableName";
    private static final String findTemplate = findAllTemplate + " WHERE idName = idValue";
    private static final String createTemplate = "INSERT tableName valuesOrder VALUES valuesPlaceholder";
    private static final String updateTemplate = "UPDATE tableName SET valuesToUpdate WHERE idName = idValue";
    private static final String deleteTemplate = "DELETE FROM tableName WHERE idName = idValue";

    private String findAll;
    private String find;
    private String create;
    private String update;
    private String delete;

    public GeneralDAOImp(Class<T> currentClass) {
        this.currentClass = currentClass;
        try {
            this.findAll = this.setQuery(findAllTemplate);
            this.find = this.setQuery(findTemplate);
            this.delete = this.setQuery(deleteTemplate);
            this.create = this.setQuery(createTemplate);
            this.update = this.setQuery(updateTemplate);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @SuppressWarnings({ "unchecked" })
    @Override
    public List<T> findAll() throws SQLException {
        List<T> entities = new LinkedList<>();
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(findAll)) {
                while (resultSet.next()) {
                    entities.add((T) new Transformer<T>((Class<T>) currentClass)
                            .transformToEntity(resultSet));
                }
            }
        }
        return entities;
    }

    @SuppressWarnings({ "unchecked" })
    @Override
    public T find(ID id) throws SQLException {
        T entity = null;
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement statement = connection
                .prepareStatement(find.replace("idValue", String.valueOf(id)))) {
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    entity = (T) new Transformer<T>((Class<T>) currentClass)
                            .transformToEntity(resultSet);
                    break;
                }
            }
        }
        return entity;
    }

    @Override
    public int delete(ID id) throws SQLException {
        int result = 0;
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement statement = connection
                .prepareStatement(delete.replace("idValue", String.valueOf(id)))) {
            result = statement.executeUpdate();
        }
        return result;
    }

    @Override
    public int update(T entity) throws SQLException {
        int result = 0;
        String currentUpdate = null;
        Connection connection = ConnectionManager.getConnection();
        try {
            currentUpdate = setUpdateQuery(entity);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        try (PreparedStatement statement = connection.prepareStatement(currentUpdate)) {
            result = statement.executeUpdate();
        }
        return result;
    }

    @Override
    public int create(T entity) throws SQLException {
        int result = 0;
        String currentCreate = null;
        Connection connection = ConnectionManager.getConnection();
        try {
            currentCreate = setCreateQuery(entity);
        } catch (IllegalArgumentException | IllegalAccessException e) {
            e.printStackTrace();
        }
        try (PreparedStatement statement = connection.prepareStatement(currentCreate)) {
            result = statement.executeUpdate();
        }
        return result;
    }

    private String setQuery(String template)
            throws IllegalArgumentException, IllegalAccessException {
        Field[] fields = currentClass.getDeclaredFields();
        String tableName = currentClass.getAnnotation(Table.class).name();
        String query = template.replace("tableName", tableName);
        for (Field field : fields) {
            if (field.isAnnotationPresent(PrimaryKey.class)) {
                String idName = field.getAnnotation(Column.class).name();
                return query.replace("idName", idName);
            }
        }
        return query;
    }

    private String setCreateQuery(T entity)
            throws IllegalArgumentException, IllegalAccessException {
        StringBuffer valuesOrder = new StringBuffer().append('(');
        StringBuffer valuesPlaceholder = new StringBuffer().append('(');
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            if (fields[i].isAnnotationPresent(PrimaryKey.class)) {
                continue;
            }
            valuesOrder.append(fields[i].getAnnotation(Column.class).name()).append(", ");
            valuesPlaceholder.append("'").append(String.valueOf(fields[i].get(entity)))
                    .append("', ");
        }
        valuesOrder.replace(valuesOrder.length() - 2, valuesOrder.length(), ")");
        valuesPlaceholder.replace(valuesPlaceholder.length() - 2, valuesOrder.length(), ")");
        return create.replace("valuesOrder", valuesOrder).replace("valuesPlaceholder",
                valuesPlaceholder);
    }

    private String setUpdateQuery(T entity)
            throws IllegalArgumentException, IllegalAccessException {
        StringBuffer valuesToUpdate = new StringBuffer();
        String currentUpdate = null;
        Field[] fields = entity.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            if (fields[i].isAnnotationPresent(PrimaryKey.class)) {
                currentUpdate = update.replace("idValue", String.valueOf(fields[i].get(entity)));
                continue;
            }
            valuesToUpdate.append(fields[i].getAnnotation(Column.class).name()).append("='")
                    .append(String.valueOf(fields[i].get(entity))).append("', ");
        }
        valuesToUpdate.replace(valuesToUpdate.length() - 2, valuesToUpdate.length(), "");
        return currentUpdate.replace("valuesToUpdate", valuesToUpdate);
    }

}
