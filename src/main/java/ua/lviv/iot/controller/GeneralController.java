package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import ua.lviv.iot.service.ServiceInterface;

public abstract class GeneralController<T, ID> implements Controller<T, ID> {

    @Override
    public abstract ServiceInterface<T, ID> getService();

    @Override
    @GetMapping("")
    public List<T> findAll() throws SQLException {
        return getService().findAll();
    }

    @Override
    @GetMapping("/{id}")
    public T find(ID id) throws SQLException {
        return (T) getService().find(id);
    }

    @Override
    @DeleteMapping("/{id}")
    public void delete(ID id) throws SQLException {
        getService().delete(id);
    }

    @Override
    @PutMapping("/{id}")
    public void update(T entity) throws SQLException {
        getService().update(entity);
    }

    @Override
    @PostMapping("")
    public void create(T entity) throws SQLException {
        getService().create(entity);
    }

}
