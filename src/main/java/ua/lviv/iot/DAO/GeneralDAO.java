package ua.lviv.iot.DAO;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;

public interface GeneralDAO<T, ID> {

    List<T> findAll(Session session) throws SQLException;

    T find(ID id, Session session) throws SQLException;

    void delete(ID id, Session session) throws SQLException;

    void update(T entity, Session session) throws SQLException;

    void create(T entity, Session session) throws SQLException;

}
