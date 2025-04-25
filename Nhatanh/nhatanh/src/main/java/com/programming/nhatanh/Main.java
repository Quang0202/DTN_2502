package com.programming.nhatanh;

import com.programming.nhatanh.lesson10.backend.DepartmentRepository;
import com.programming.nhatanh.lesson10.backend.PositionRepository;

import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
//        String url = "jdbc:mysql://localhost:3306/testingsystem?autoReconnect=true&useSSL=false&characterEncoding=latin1";
//        String username = "root";
//        String password = "178555";
//        Class.forName("com.mysql.cj.jdbc.Driver");
//
//        Connection connection = DriverManager.getConnection(url, username, password);
//
//        System.out.println("Connected");

        DepartmentRepository positionRepository = new DepartmentRepository();
        var result = positionRepository.getDepartmentById(5);
        System.out.println(result);



    }
}