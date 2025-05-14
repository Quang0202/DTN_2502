package org.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.sql.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//        String url = "jdbc:mysql://localhost:3306/TestingSystem";
//        String userName = "root";
//        String password = "elegantmagic2444";
        Connection connection = JdbcUtils.getConnection();
        connection.setAutoCommit(false);
        try {

        } catch (Exception e) {
            connection.rollback();
        }
        connection.commit();

        if (connection != null) {
//            String res = "SELECT * FROM Department;";
//
//            Statement statement = connection.createStatement();
//            ResultSet resultSet = statement.executeQuery(res);
//
//            ArrayList<Department> departments = new ArrayList<>();
//            while (resultSet.next()) {
//                Department department = new Department(resultSet.getInt(1), resultSet.getString("DepartmentName"));
//                departments.add(department);
//            }
//
//            for(Department department : departments) {
//                System.out.println(department);
//            }
//            String departmentName = "ahaha";
//            String sql = "INSERT INTO Department(departmentname) \n" +
//                    "VALUES ('Test5');";
//            Statement statement = connection.createStatement();
////            System.out.println(statement.executeUpdate(sql)); // tra ve so dong duoc update.
//            System.out.println(statement.execute(sql)); // return boolean resultSet.
//            // statement se luu ket qua sau khi .execute
//            String departmentName = "ahihi";
//            String sql = "INSERT INTO Department(departmentname) \n" +
//                    "VALUES (?);";
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.setString(1, departmentName);
//            LocalDateTime localDateTime = LocalDateTime.now();
//            preparedStatement.setTimestamp(1, Timestamp.valueOf(localDateTime));
//            preparedStatement.execute();
//            int num = preparedStatement.getUpdateCount();
//            System.out.println(num);

//            PositionRepository positionRepository = new PositionRepository();
//            List<Position> positions = positionRepository.getAllPosition();
//
//            for (Position p : positions) {
//                System.out.println(p);
//            }

            DepartmentRepository departmentRepository = new DepartmentRepository();
            departmentRepository.createProcedure();
        }
    }
}