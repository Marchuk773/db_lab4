package ua.lviv.iot.service;

import ua.lviv.iot.DAO.UserDAOImp;
import ua.lviv.iot.model.entity.User;

public class UserService extends GeneralService<User, Integer, UserDAOImp> {

    public UserService() {
        super(UserDAOImp.class);
    }

}
