import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Exercise5 {
    public void ques1(Department[] departments) {
        System.out.println(departments[1]);
    }

    public void ques2(Department[] departments) {
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public void ques3(Department[] departments) {
        System.out.println(departments[0].hashCode());
    }

    public void ques4(Department[] departments) {
        System.out.println(departments[0].departmentName.equals("Phòng A"));
    }

    public void ques5(Department[] departments) {
        System.out.println(departments[0].equals(departments[1]));
    }

    public void ques6() {
        Scanner scanner = new Scanner(System.in);
        Department[] departments = new Department[5];
        for (int i = 0; i < 5; i++) {
            departments[i] = new Department();
            System.out.println("Nhap id phong ban:");
            departments[i].departmentId = scanner.nextInt();
            System.out.println("Nhap ten phong ban:");
            scanner.nextLine();
            departments[i].departmentName = scanner.nextLine();
        }
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                return o1.departmentName.compareTo(o2.departmentName);
            }
        });
        for (Department department : departments) {
            System.out.println(department);
        }
    }

    public void ques7() {
        Scanner scanner = new Scanner(System.in);
        Department[] departments = new Department[5];
        for (int i = 0; i < 5; i++) {
            departments[i] = new Department();
            System.out.println("Nhap id phong ban:");
            departments[i].departmentId = scanner.nextInt();
            System.out.println("Nhap ten phong ban:");
            scanner.nextLine();
            departments[i].departmentName = scanner.nextLine();
        }
        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                String[] strs1 = o1.departmentName.split("\\s+");
                String os1 = strs1[strs1.length - 1];
                String[] strs2 = o2.departmentName.split("\\s+");
                String os2 = strs2[strs2.length - 1];
                return os1.compareTo(os2);
            }
        });
        for (Department department : departments) {
            System.out.println(department);
        }
    }
}
