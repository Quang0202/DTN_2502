import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Order {
    public static void main(String[] args) {
        Integer [] arr = { 1, 5,2,100,22,77 };
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i : arr){
            System.out.println(i);
        }

        Department d1 = new Department();
        d1.DepartmentID = 1;
        d1.DepartmentName = "nguyen van a";
        Department d2 = new Department();
        d2.DepartmentID = 2;
        d2.DepartmentName = "nguyen van b";
        Department d3 = new Department();
        d3.DepartmentID = 3;
        d3.DepartmentName = "nguyen van c";
        Department d4 = new Department();
        d4.DepartmentID = 2;
        d4.DepartmentName = "nguyen van d";
        Department[] departments = {d4, d1, d2, d3 };
        for(Department d : departments){
            System.out.println(d);
        }

        Arrays.sort(departments, new Comparator<Department>() {
            public int compare(Department o1, Department o2) {
//                return o1.DepartmentID - o2.DepartmentID;
                return o1.DepartmentName.compareTo(o2.DepartmentName);
            }
        });
        for(Department d : departments){
            System.out.println(d);
        }
    }

}
