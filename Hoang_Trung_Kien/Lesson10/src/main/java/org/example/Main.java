package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//        String url = "jdbc:mysql://localhost:3306/TestingSystem";
//        String userName = "root";
//        String password = "elegantmagic2444";
        Connection connection = JdbcUtils.getConnection();
        if (connection != null) {
            String res = "SELECT * FROM Department;";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(res);
//        while(resultSet.next()) {
//            System.out.println(resultSet.getInt(1) + " " + resultSet.getString("DepartmentName"));
//        }
            ArrayList<Department> departments = new ArrayList<>();
            while (resultSet.next()) {
                Department department = new Department(resultSet.getInt(1), resultSet.getString("DepartmentName"));
                departments.add(department);
            }

            for(Department department : departments) {
                System.out.println(department);
            }
        }
    }
}