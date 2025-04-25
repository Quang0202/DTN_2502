package com.programming.nhatanh.lesson10.frontend;

import com.programming.nhatanh.lesson10.backend.AccountRepository;
import com.programming.nhatanh.lesson10.backend.DepartmentRepository;
import com.programming.nhatanh.lesson10.backend.PositionRepository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

import static com.programming.nhatanh.lesson10.backend.JdbcUtils.getConnection;

public class Main {


    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {





        AccountRepository accountRepository = new AccountRepository();
        DepartmentRepository departmentRepository = new DepartmentRepository();
        PositionRepository positionRepository = new PositionRepository();

        //E2Q3
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id:");
        departmentRepository.getDepartmentById(scanner.nextInt());
        scanner.close();


        //E4
        Connection connectionMain = getConnection();
        connectionMain.setAutoCommit(false);
        try {
            accountRepository.deleteAccountByDepartment(3);
            departmentRepository.deleteDepartment(3);
            connectionMain.commit();
        } catch ( SQLException e ) {
            e.printStackTrace();
            connectionMain.rollback();
            System.out.println("Transaction failed");
        }
        connectionMain.setAutoCommit(true);
        connectionMain.close();
    }
}
