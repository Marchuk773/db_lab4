package ua.lviv.iot.controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.model.entity.Person;
import ua.lviv.iot.persistant.ConnectionManager;
import ua.lviv.iot.service.PersonService;

public class PersonController extends GeneralController<Person, Integer, PersonService> {

    public PersonController() {
        super(PersonService.class);
    }

    public List<Person> findByInitials(String name, String surname) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<Person> people = new PersonService().findByInitials(name, surname);
        connection.close();
        return people;
    }

}
