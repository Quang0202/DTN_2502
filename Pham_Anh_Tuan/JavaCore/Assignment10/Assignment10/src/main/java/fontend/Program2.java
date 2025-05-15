package fontend;

import backend.DepartmentDAO;
import entity.Department;

import java.util.List;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        try {
            DepartmentDAO departmentDao = new DepartmentDAO();
            Scanner scanner = new Scanner(System.in);

            // Test get all departments
            List<Department> departments = departmentDao.getDepartments();
            for (Department department : departments) {
                System.out.println(department);
            }

            // Test get department by id
            System.out.println("Enter department id: ");
            int id = scanner.nextInt();
            Department department = departmentDao.getDepartmentById(id);
            System.out.println(department);

            // Test create department
            System.out.println("Enter department name to create: ");
            scanner.nextLine(); // clear buffer
            String name = scanner.nextLine();
            departmentDao.createDepartment(name);
            System.out.println("Department created!");

            // Test update department name
            System.out.println("Enter department id to update: ");
            int updateId = scanner.nextInt();
            System.out.println("Enter new department name: ");
            scanner.nextLine();
            String newName = scanner.nextLine();
            departmentDao.updateDepartmentName(updateId, newName);
            System.out.println("Department updated!");

            // Test delete department
            System.out.println("Enter department id to delete: ");
            int deleteId = scanner.nextInt();
            departmentDao.deleteDepartment(deleteId);
            System.out.println("Department deleted!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
