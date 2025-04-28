package com.vti.backend.presentationlayer;

import com.vti.backend.businesslayer.IUserService;
import com.vti.backend.businesslayer.UserService;
import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public class UserController {

    private IUserService userService;

    public UserController() {
        userService = new UserService();
    }

    public List<User> getListUsers() {
        return userService.getListUsers();
    }

    public User getUserById(int userId) {
        return userService.getUserById(userId);
    }

    public User login(String email, String password) {
        return userService.login(email, password);
    }

    public boolean deleteUserExistsById(int userId) {
        return userService.deleteUserExistsById(userId);
    }

    public boolean isUserExistsByEmail(String email) {
        return userService.isUserExistsByEmail(email);
    }

    public void createUser(String fullname, String email) {
        userService.createUser(fullname, email);
    }
}
