package ua.lviv.iot.transformer;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import ua.lviv.iot.model.annotation.Table;
import ua.lviv.iot.model.annotation.Column;
import ua.lviv.iot.model.annotation.CompositePrimaryKey;

public class Transformer<T> {

    private Class<T> myClass;

    public Transformer(Class<T> myClass) {
        this.myClass = myClass;
    }

    public Object transformToEntity(ResultSet rs) throws SQLException {
        Object entity = null;
        try {
            entity = myClass.getConstructor().newInstance();
            if (myClass.isAnnotationPresent(Table.class)) {
                for (Field field : myClass.getDeclaredFields()) {
                    if (field.isAnnotationPresent(Column.class)) {
                        field.setAccessible(true);
                        Column column = (Column) field.getAnnotation(Column.class);
                        String name = column.name();
                        @SuppressWarnings("rawtypes")
                        Class fieldType = field.getType();
                        if (fieldType == Integer.class) {
                            field.set(entity, rs.getInt(name));
                        } else if (fieldType == String.class) {
                            field.set(entity, rs.getString(name));
                        } else if (fieldType == Date.class) {
                            field.set(entity, rs.getDate(name));
                        } else if (fieldType == Double.class) {
                            field.set(entity, rs.getDouble(name));
                        }
                    } else if (field.isAnnotationPresent(CompositePrimaryKey.class)) {
                        field.setAccessible(true);
                        @SuppressWarnings("rawtypes")
                        Class fieldType = field.getType();
                        @SuppressWarnings("unchecked")
                        Object PK = fieldType.getConstructor().newInstance();
                        field.set(entity, PK);
                        for (Field innerField : fieldType.getDeclaredFields()) {
                            if (innerField.isAnnotationPresent(Column.class)) {
                                innerField.setAccessible(true);
                                Column column = (Column) innerField.getAnnotation(Column.class);
                                String name = column.name();
                                @SuppressWarnings("rawtypes")
                                Class innerFieldType = innerField.getType();
                                if (innerFieldType == Integer.class) {
                                    innerField.set(PK, rs.getInt(name));
                                } else if (innerFieldType == String.class) {
                                    innerField.set(PK, rs.getString(name));
                                } else if (innerFieldType == Date.class) {
                                    innerField.set(PK, rs.getDate(name));
                                } else if (innerFieldType == Double.class) {
                                    innerField.set(PK, rs.getDouble(name));
                                }
                            }
                        }
                    }
                }
            }
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
        }
        return entity;
    }
}
