package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.DAO.GeneralDAO;

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
        return dataaccess.findAll();
    }

    @Override
    public T find(ID id) throws SQLException {
        return dataaccess.find(id);
    }

    @Override
    public int delete(ID id) throws SQLException {
        return dataaccess.delete(id);
    }

    @Override
    public int update(T entity) throws SQLException {
        return dataaccess.update(entity);
    }

    @Override
    public int create(T entity) throws SQLException {
        return dataaccess.create(entity);
    }

}
