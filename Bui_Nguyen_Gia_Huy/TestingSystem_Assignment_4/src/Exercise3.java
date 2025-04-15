public class Exercise3 {
    public void demoAccess() {
        Department dep = new Department("Finance");
        dep.setId(101);
        System.out.println("Department ID: " + dep.getId());
        System.out.println("Department Name: " + dep.getName());
    }
}
