package ua.lviv.iot.DAO;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import ua.lviv.iot.model.entity.Person;

@SuppressWarnings({ "rawtypes", "deprecation" })
public class PersonDAOImp extends GeneralDAOImp<Person, Integer> {

    public PersonDAOImp() {
        super(Person.class);
    }

    public List<Person> findByInitials(String name, String surname, Session session)
            throws SQLException {
        List<Person> people = new LinkedList<>();
        Query query = session
                .createQuery("FROM Person WHERE name=nameValue AND surname=surnameValue");
        query.setParameter("nameValue", name).setParameter("surnameValue", surname);
        for (Object person : query.getResultList()) {
            people.add((Person) person);
        }
        return people;
    }

}
