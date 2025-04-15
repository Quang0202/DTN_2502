import model.Employee;
import model.Manager;
import model.Waiter;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Kien", 100.0);
        Manager manager = new Manager("Trung", 100.0);
        Waiter waiter = new Waiter("Khanh", 100.0);
        employee.displayInfo();
        manager.displayInfo();
        waiter.displayInfo();
    }
}