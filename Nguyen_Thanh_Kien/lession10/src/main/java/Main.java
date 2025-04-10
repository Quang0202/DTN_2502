import dao.impls.DepartmentDaoImpl;
import dao.impls.PositionDaoImpl;
import model.Department;
import model.Position;
import utils.ConnectionUtil;

import java.io.IOException;
import java.sql.*;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    private static final PositionDaoImpl positionDao = new PositionDaoImpl();
    private static final DepartmentDaoImpl departmentDao = new DepartmentDaoImpl();

    public static void main(String[] args) {
//        exe1Question1();
//        exe1Question2();
//        exe1Question3();
//        exe1Question4();
//        exe1Question5();
//        exe2Question1();
//        exe2Question2_3();
//        exe2Question4();
//        exe2Question5();
//        exe2Question6();
//        exe2Question7();
        Exe2Question8.getAllAccounts();
    }

    private static void exe1Question1() {
        getConnection();
    }

    private static void exe1Question2() {
        List<Position> positionList = positionDao.getAll(new String[]{"position_id", "position_name"});
        System.out.println(positionList);
    }

    private static void exe1Question3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten position: ");
        Position position = new Position(scanner.nextLine());
        positionDao.save(position);
        System.out.println("Position created");
    }

    private static void exe1Question4() {
        Optional<Position> position = positionDao.findById(5);
        if (position.isPresent()) {
            position.get().setPositionName("Dev");
            positionDao.update(position.get());
            System.out.println("Position updated");
        } else {
            throw new RuntimeException("Position id: " + 5 + " not found");
        }
    }

    private static void exe1Question5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id position: ");
        int id = scanner.nextInt();
        Optional<Position> position = positionDao.findById(id);
        if (position.isPresent()) {
            positionDao.delete(position.get());
            System.out.println("Position deleted");
        } else {
            throw new RuntimeException("Position id: " + id + " not found");
        }
    }

    private static void exe2Question1() {
        System.out.println(departmentDao.getAll());
    }

    private static void exe2Question2_3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id department: ");
        int id = scanner.nextInt();
        Optional<Department> department = departmentDao.findById(id);
        if (department.isPresent()) {
            System.out.println(department);
        } else {
            throw new RuntimeException("Department id: " + id + " not found");
        }
    }

    private static void exe2Question4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap name department: ");
        String name = scanner.nextLine();
        System.out.println(departmentDao.isDepartmentNameExists(name));
    }

    private static void exe2Question5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap name department: ");
        String name = scanner.nextLine();
        if(departmentDao.isDepartmentNameExists(name)){
            throw new RuntimeException("Department name is Exists!");
        } else {
            departmentDao.save(new Department(name));
            System.out.println("Department created");
        }
    }

    private static void exe2Question6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id department: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhap name department: ");
        String name = scanner.nextLine();
        Optional<Department> department = departmentDao.findById(id);
        if (department.isPresent()) {
            if(departmentDao.isDepartmentNameExists(name)){
                throw new RuntimeException("Department name is Exists!");
            }
            department.get().setDepartmentName(name);
            departmentDao.update(department.get());
            System.out.println("Department updated");
        } else {
            throw new RuntimeException("Department id: " + id + " not found");
        }
    }

    private static void exe2Question7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap id depatment: ");
        int id = scanner.nextInt();
        Optional<Department> department = departmentDao.findById(id);
        if (department.isPresent()) {
            departmentDao.delete(department.get());
            System.out.println("Department deleted");
        } else {
            throw new RuntimeException("Department id: " + id + " not found");
        }
    }

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