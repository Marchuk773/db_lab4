package ua.lviv.iot.DAO;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

@SuppressWarnings({ "unchecked", "deprecation", "rawtypes" })
public abstract class GeneralDAOImp<T, ID> implements GeneralDAO<T, ID> {

    private final Class<T> currentClass;

    public GeneralDAOImp(Class<T> currentClass) {
        this.currentClass = currentClass;
    }

    @Override
    public List<T> findAll(Session session) throws SQLException {
        List<T> entities = new LinkedList<>();
        Query query = session.createQuery("FROM " + currentClass.getSimpleName());
        for (Object entity : query.getResultList()) {
            entities.add((T) entity);
        }
        return entities;
    }

    @Override
    public T find(ID id, Session session) throws SQLException {
        return (T) session.get(currentClass, (Integer) id);
    }

    @Override
    public void delete(ID id, Session session) throws SQLException {
        session.beginTransaction();
        T deletedEntity = find(id, session);
        session.delete(deletedEntity);
        session.getTransaction().commit();
    }

    @Override
    public void update(T entity, Session session) throws SQLException {
        session.beginTransaction();
        session.update(entity);
        session.getTransaction().commit();
    }

    @Override
    public void create(T entity, Session session) throws SQLException {
        session.beginTransaction();
        session.save(entity);
        session.getTransaction().commit();
    }

}
