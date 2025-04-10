import dao.impls.AccountDaoImpl;
import model.Account;
import model.Department;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Optional;
import java.util.Scanner;

public class Exe2Question8 {

    private static final AccountDaoImpl accountDaoImpl = new AccountDaoImpl();

    public static void getAllAccounts() {
        System.out.println(accountDaoImpl.getAll());
    }

//    private static void exe2Question2_3() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap id department: ");
//        int id = scanner.nextInt();
//        Optional<Department> department = departmentDao.findById(id);
//        if (department.isPresent()) {
//            System.out.println(department);
//        } else {
//            throw new RuntimeException("Department id: " + id + " not found");
//        }
//    }
//
//    private static void exe2Question4() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap name department: ");
//        String name = scanner.nextLine();
//        System.out.println(departmentDao.isDepartmentNameExists(name));
//    }
//
//    private static void exe2Question5(){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap name department: ");
//        String name = scanner.nextLine();
//        if(departmentDao.isDepartmentNameExists(name)){
//            throw new RuntimeException("Department name is Exists!");
//        } else {
//            departmentDao.save(new Department(name));
//            System.out.println("Department created");
//        }
//    }
//
//    private static void exe2Question6() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap id department: ");
//        int id = scanner.nextInt();
//        scanner.nextLine();
//        System.out.println("Nhap name department: ");
//        String name = scanner.nextLine();
//        Optional<Department> department = departmentDao.findById(id);
//        if (department.isPresent()) {
//            if(departmentDao.isDepartmentNameExists(name)){
//                throw new RuntimeException("Department name is Exists!");
//            }
//            department.get().setDepartmentName(name);
//            departmentDao.update(department.get());
//            System.out.println("Department updated");
//        } else {
//            throw new RuntimeException("Department id: " + id + " not found");
//        }
//    }
//
//    private static void exe2Question7() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhap id depatment: ");
//        int id = scanner.nextInt();
//        Optional<Department> department = departmentDao.findById(id);
//        if (department.isPresent()) {
//            departmentDao.delete(department.get());
//            System.out.println("Department deleted");
//        } else {
//            throw new RuntimeException("Department id: " + id + " not found");
//        }
//    }

    private static void getConnection() {
        try {
            Connection connect = ConnectionUtil.getConnection();
            connect.close();
            System.out.println("Connect success!");
        } catch (SQLException | ClassNotFoundException | IOException e) {
            throw new RuntimeException(e);
        }
    }
}
