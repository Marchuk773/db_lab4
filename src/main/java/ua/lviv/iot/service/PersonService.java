package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.PersonRepository;
import ua.lviv.iot.domain.Person;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService extends GeneralService<Person, Integer> {

    @Autowired
    PersonRepository personRepository;

    @Override
    public JpaRepository<Person, Integer> getRepository() {
        return personRepository;
    }

}
