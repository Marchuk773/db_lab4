package ua.lviv.iot.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.DAO.GeneralDAO;
import ua.lviv.iot.persistant.ConnectionManager;

public abstract class GeneralService<T, ID, DAO> implements Service<T, ID> {

    private GeneralDAO<T, ID> dataaccess;

    @SuppressWarnings({ "unchecked", "deprecation" })
    public GeneralService(Class<DAO> currentClass) {
        try {
            dataaccess = (GeneralDAO<T, ID>) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> findAll() throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<T> entities = dataaccess.findAll();
        connection.close();
        return entities;
    }

    @Override
    public T find(ID id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        T entity = dataaccess.find(id);
        connection.close();
        return entity;
    }

    @Override
    public int delete(ID id) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = dataaccess.delete(id);
        connection.close();
        return result;
    }

    @Override
    public int update(T entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = dataaccess.update(entity);
        connection.close();
        return result;
    }

    @Override
    public int create(T entity) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        int result = dataaccess.create(entity);
        connection.close();
        return result;
    }

}
