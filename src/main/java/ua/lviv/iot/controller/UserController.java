package ua.lviv.iot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ua.lviv.iot.domain.User;
import ua.lviv.iot.service.ServiceInterface;
import ua.lviv.iot.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController extends GeneralController<User, Integer> {

    @Autowired
    UserService userService;

    @Override
    public ServiceInterface<User, Integer> getService() {
        return userService;
    }

}
