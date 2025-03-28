import com.vti.entity.Department;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Department department = new Department(1, "nguyen van a");
        System.out.println(department);
        Department department1 = new Department("nguyen van v");
        System.out.println(department1);
        Department department2 = new Department();
    }
}