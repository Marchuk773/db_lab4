package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.lviv.iot.service.GeneralService;

@SuppressWarnings({ "deprecation", "rawtypes", "unchecked" })
public abstract class GeneralController<T, ID, SERVICE> implements Controller<T, ID> {

    GeneralService service;
    private static final SessionFactory sessionFactory;

    static {
        try {
            Configuration configuration = new Configuration();
            configuration.configure();
            sessionFactory = configuration.buildSessionFactory();
        } catch (Throwable throwable) {
            throw new ExceptionInInitializerError(throwable);
        }
    }

    public GeneralController(Class<SERVICE> currentClass) {
        try {
            service = (GeneralService) currentClass.newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<T> findAll() throws SQLException {
        Session session = sessionFactory.openSession();
        List<T> entities = null;
        try {
            entities = service.findAll(session);
        } finally {
            session.close();
        }
        return entities;
    }

    @Override
    public T find(ID id) throws SQLException {
        Session session = sessionFactory.openSession();
        T entity = null;
        try {
            entity = (T) service.find(id, session);
        } finally {
            session.close();
        }
        return entity;
    }

    @Override
    public void delete(ID id) throws SQLException {
        Session session = sessionFactory.openSession();
        try {
            service.delete(id, session);
        } finally {
            session.close();
        }
    }

    @Override
    public void update(T entity) throws SQLException {
        Session session = sessionFactory.openSession();
        try {
            service.update(entity, session);
        } finally {
            session.close();
        }
    }

    @Override
    public void create(T entity) throws SQLException {
        Session session = sessionFactory.openSession();
        try {
            service.create(entity, session);
        } finally {
            session.close();
        }
    }

}
