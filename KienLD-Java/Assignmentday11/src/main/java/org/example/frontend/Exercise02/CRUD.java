package org.example.frontend.Exercise02;

import org.example.backend.DepartmentDao;

import java.sql.SQLException;
import java.util.Scanner;

public class CRUD {
    public static void main(String args[]) throws SQLException {
            DepartmentDao departmentDao = new DepartmentDao();
//            departmentDao.question01();
//        departmentDao.question02();

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Departmentid: ");
//        int id = sc.nextInt();
//        departmentDao.question03(id);

//        System.out.println(departmentDao.question04("Sale"));
//        departmentDao.question05("devops");
//            departmentDao.question06(11, "sys");

        departmentDao.question01procedure();



    }

}
