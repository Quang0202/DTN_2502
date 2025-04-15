import java.util.Arrays;

public class Exercise5 {

    // Question 1
    public void question1(Department dep) {
        System.out.println(dep);
    }

    // Question 2
    public void question2(Department[] departments) {
        for (Department d : departments) {
            System.out.println(d);
        }
    }

    // Question 3
    public void question3(Department dep) {
        System.out.println("Address: " + dep.hashCode());
    }

    // Question 4
    public void question4(Department dep) {
        if ("Phòng A".equals(dep.name)) {
            System.out.println("Yes, it's Phòng A");
        } else {
            System.out.println("No");
        }
    }

    // Question 5
    public void question5(Department dep1, Department dep2) {
        if (dep1.name.equals(dep2.name)) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }

    // Question 6
    public void question6() {
        Department[] deps = new Department[5];
        deps[0] = new Department(1, "Sale");
        deps[1] = new Department(2, "Accounting");
        deps[2] = new Department(3, "Marketing");
        deps[3] = new Department(4, "Boss of director");
        deps[4] = new Department(5, "Waiting room");

        Arrays.sort(deps, (a, b) -> a.name.compareToIgnoreCase(b.name));
        for (Department d : deps) {
            System.out.println(d.name);
        }
    }

    // Question 7
    public void question7() {
        question6(); // same logic
    }
}
