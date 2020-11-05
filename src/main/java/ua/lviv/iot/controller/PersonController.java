package ua.lviv.iot.controller;

import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.model.entity.Person;
import ua.lviv.iot.service.PersonService;

public class PersonController extends GeneralController<Person, Integer, PersonService> {

    public PersonController() {
        super(PersonService.class);
    }

    public List<Person> findByInitials(String name, String surname) throws SQLException {
        return new PersonService().findByInitials(name, surname);
    }

}
