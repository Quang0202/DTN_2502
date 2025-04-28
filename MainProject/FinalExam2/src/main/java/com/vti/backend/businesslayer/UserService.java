package com.vti.backend.businesslayer;

import com.vti.backend.datalayer.IUserRepository;
import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class UserService implements IUserService {

    private IUserRepository userRepository;

    public UserService() {
        userRepository = new UserRepository();
    }

    public List<User> getListUsers() {
        return userRepository.getListUsers();
    }

    public User getUserById(int userId) {
        return userRepository.getUserById(userId);
    }

    public boolean deleteUserExistsById(int userId) {
        return userRepository.deleteUserExistsById(userId);
    }

    public User login(String email, String password) {
        return userRepository.login(email, password);
    }

    public boolean isUserExistsByEmail(String email) {
        return userRepository.isUserExistsByEmail(email);
    }

    public void createUser(String fullname, String email) {
        userRepository.createUser(fullname, email);
    }
}
