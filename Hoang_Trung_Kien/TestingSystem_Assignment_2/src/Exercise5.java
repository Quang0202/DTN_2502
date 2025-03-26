import java.util.Scanner;

public class Exercise5 {
    public Department createDepartment() {
        Department department = new Department();
        Scanner scanner = new Scanner(System.in);
        department.departmentId = scanner.nextInt();
        department.departmentName = scanner.next();
        return department;
    }
}
