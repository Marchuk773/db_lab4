package ua.lviv.iot.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.persistant.ConnectionManager;
import ua.lviv.iot.service.GeneralService;

@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
public abstract class GeneralController<T, ID, SERVICE> implements Controller<T, ID> {

    GeneralService service;

    public GeneralController(Class<SERVICE> currentClass) {
        try {
            service = (GeneralService) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> findAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<T> entities = service.findAll();
        connection.close();
        return entities;
    }

    @Override
    public T find(ID id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        T entity = (T) service.find(id);
        connection.close();
        return entity;
    }

    @Override
    public int delete(ID id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = service.delete(id);
        connection.close();
        return result;
    }

    @Override
    public int update(T entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = service.update(entity);
        connection.close();
        return result;
    }

    @Override
    public int create(T entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = service.create(entity);
        connection.close();
        return result;
    }

}
