package ua.lviv.iot.service;

import java.sql.SQLException;
import java.util.List;

public interface Service<T, ID> {

    List<T> findAll() throws SQLException;

    T find(ID id) throws SQLException;

    int delete(ID id) throws SQLException;

    int update(T entity) throws SQLException;

    int create(T entity) throws SQLException;

}
