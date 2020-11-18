package ua.lviv.iot.controller;

import ua.lviv.iot.model.entity.User;
import ua.lviv.iot.service.UserService;

public class UserController extends GeneralController<User, Integer, UserService> {

    public UserController() {
        super(UserService.class);
    }

}
