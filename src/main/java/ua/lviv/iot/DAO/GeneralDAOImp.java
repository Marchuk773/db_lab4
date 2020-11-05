package ua.lviv.iot.DAO;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.persistant.ConnectionManager;
import ua.lviv.iot.transformer.Transformer;

public abstract class GeneralDAOImp<T, ID> implements GeneralDAO<T, ID> {

    private final Class<T> currentClass;
    private String findAll;
    private String find;
    private String create;
    private String update;
    private String delete;

    public GeneralDAOImp(Class<T> currentClass, String findAll, String find, String create,
            String update, String delete) {
        this.currentClass = currentClass;
        this.findAll = findAll;
        this.find = find;
        this.create = create;
        this.update = update;
        this.delete = delete;
    }

    @SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
    @Override
    public List<T> findAll() throws SQLException {
        List<T> entities = new LinkedList<>();
        T instance = null;
        try {
            instance = currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Connection connection = ConnectionManager.getConnection();
        try (Statement statement = connection.createStatement()) {
            try (ResultSet resultSet = statement.executeQuery(findAll)) {
                while (resultSet.next()) {
                    entities.add(
                            (T) new Transformer(instance.getClass()).transformToEntity(resultSet));
                }
            }
        }
        return entities;
    }

    @SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
    @Override
    public T find(ID id) throws SQLException {
        T entity = null;
        T instance = null;
        try {
            instance = currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(find)) {
            statement.setString(1, String.valueOf(id));
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    entity = (T) new Transformer(instance.getClass()).transformToEntity(resultSet);
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
        try (PreparedStatement statement = connection.prepareStatement(delete)) {
            statement.setString(1, String.valueOf(id));
            result = statement.executeUpdate();
        }
        return result;
    }

    @Override
    public int update(T entity) throws SQLException {
        return executeUpdateOrCreate(entity, update);
    }

    @Override
    public int create(T entity) throws SQLException {
        return executeUpdateOrCreate(entity, create);
    }

    private int executeUpdateOrCreate(T entity, String query) throws SQLException {
        int result = 0;
        Field[] fields = entity.getClass().getDeclaredFields();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            int index = 0;
            for (Field field : fields) {
                try {
                    statement.setString(++index, String.valueOf(field.get(entity)));
                } catch (IllegalArgumentException | IllegalAccessException | SQLException e) {
                    e.printStackTrace();
                }
            }
            result = statement.executeUpdate();
        }
        return result;
    }

}
