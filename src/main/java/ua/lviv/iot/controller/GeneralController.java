package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;
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
        return service.findAll();
    }

    @Override
    public T find(ID id) throws SQLException {
        return (T) service.find(id);
    }

    @Override
    public int delete(ID id) throws SQLException {
        return service.delete(id);
    }

    @Override
    public int update(T entity) throws SQLException {
        return service.update(entity);
    }

    @Override
    public int create(T entity) throws SQLException {
        return service.create(entity);
    }

}
