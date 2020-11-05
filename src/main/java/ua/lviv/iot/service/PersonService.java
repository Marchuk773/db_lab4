package ua.lviv.iot.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import ua.lviv.iot.DAO.PersonDAOImp;
import ua.lviv.iot.model.entity.Person;
import ua.lviv.iot.persistant.ConnectionManager;

public class PersonService extends GeneralService<Person, Integer, PersonDAOImp> {

    public PersonService() {
        super(PersonDAOImp.class);
    }

    public List<Person> findByInitials(String name, String surname) throws SQLException {
        Connection connection = ConnectionManager.getConnection();
        List<Person> people = new PersonDAOImp().findByInitials(name, surname);
        connection.close();
        return people;
    }

}
