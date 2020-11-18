package ua.lviv.iot.DAO;

import ua.lviv.iot.model.entity.User;

public class UserDAOImp extends GeneralDAOImp<User, Integer> {

    public UserDAOImp() {
        super(User.class);
    }

}
