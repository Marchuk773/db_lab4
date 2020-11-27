package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.Person;
import ua.lviv.iot.service.PersonService;
import ua.lviv.iot.service.ServiceInterface;

@RestController
@RequestMapping("/person")
public class PersonController extends GeneralController<Person, Integer> {

    @Autowired
    PersonService personService;

    @Override
    public ServiceInterface<Person, Integer> getService() {
        return personService;
    }

}
