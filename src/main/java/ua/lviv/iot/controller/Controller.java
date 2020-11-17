package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;

public interface Controller<T, ID> {

    List<T> findAll() throws SQLException;

    T find(ID id) throws SQLException;

    void delete(ID id) throws SQLException;

    void update(T entity) throws SQLException;

    void create(T entity) throws SQLException;

}
