package ua.lviv.iot.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.model.entity.Person;
import ua.lviv.iot.persistant.ConnectionManager;
import ua.lviv.iot.transformer.Transformer;

public class PersonDAOImp extends GeneralDAOImp<Person, Integer> {

    private static final String findByInitials = "SELECT * FROM person WHERE name = ? AND surname = ?";

    public PersonDAOImp() {
        super(Person.class);
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    public List<Person> findByInitials(String name, String surname) throws SQLException {
        List<Person> people = new LinkedList<>();
        Connection connection = ConnectionManager.getConnection();
        try (PreparedStatement statement = connection.prepareStatement(findByInitials)) {
            statement.setString(1, String.valueOf(name));
            statement.setString(2, String.valueOf(surname));
            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    people.add((Person) new Transformer(Person.class).transformToEntity(resultSet));
                }
            }
        }
        return people;
    }

}
