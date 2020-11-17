package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import ua.lviv.iot.model.entity.Person;
import ua.lviv.iot.service.PersonService;

public class PersonController extends GeneralController<Person, Integer, PersonService> {

    public PersonController() {
        super(PersonService.class);
    }

    public List<Person> findByInitials(String name, String surname) throws SQLException {
        Session session = new Configuration().configure("/resources/hibernate.cfg.xml")
                .buildSessionFactory().openSession();
        PersonService service = new PersonService();
        List<Person> people = null;
        try {
            people = service.findByInitials(name, surname, session);
        } finally {
            session.close();
        }
        return people;
    }

}
