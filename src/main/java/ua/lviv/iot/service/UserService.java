package ua.lviv.iot.service;

import ua.lviv.iot.dataaccess.UserRepository;
import ua.lviv.iot.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService extends GeneralService<User, Integer> {

    @Autowired
    UserRepository userRepository;

    @Override
    public JpaRepository<User, Integer> getRepository() {
        return userRepository;
    }

}
