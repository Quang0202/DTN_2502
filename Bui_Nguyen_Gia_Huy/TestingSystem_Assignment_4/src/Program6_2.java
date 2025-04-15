public class Program6_2 {
    public static void main(String[] args) {
        User emp = new Employee("Nam", 1.5);
        User mgr = new Manager("Linh", 2.0);
        User waiter = new Waiter("Minh", 1.2);

        emp.displayInfo();
        mgr.displayInfo();
        waiter.displayInfo();
    }
}