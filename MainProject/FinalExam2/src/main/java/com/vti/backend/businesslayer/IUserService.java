package com.vti.backend.businesslayer;

import com.vti.entity.User;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface IUserService {
    List<User> getListUsers();

    User getUserById(int userId);

    boolean deleteUserExistsById(int userId);

    User login(String in_email, String in_password);

    boolean isUserExistsByEmail(String email);

    void createUser(String fullname, String email);

}
