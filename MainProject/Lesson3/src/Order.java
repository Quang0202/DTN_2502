import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Order {
    public static void main(String[] args) {
        Integer [] arr = {1,5,2,100,22,77};
        Arrays.sort(arr, Collections.reverseOrder());
        for(int i: arr){
            System.out.println(i);
        }
        Department department1  = new Department();
        department1.departmentId = 1;
        department1.departmentName = "nguyen van a";
        Department department2 = new Department();
        department2.departmentId = 2;
        department2.departmentName = "nguyen van b";
        Department department3 = new Department();
        department3.departmentName = "nguyen van c";
        department3.departmentId = 3;
        Department department4 = new Department();
        department4.departmentName = "nguyen van d";
        department4.departmentId = 2;
        Department[] departments = {department3,department4,department1,department2};

        for(Department department : departments){
            System.out.println(department);
        }

        Arrays.sort(departments, new Comparator<Department>() {
            @Override
            public int compare(Department o1, Department o2) {
                if(o1.departmentId == o2.departmentId){
                    return o1.departmentName.compareTo(o2.departmentName);
                }
                return o1.departmentId - o2.departmentId;
            }
        });
        System.out.println("sau khi ss-----------");

        for(Department department : departments){
            System.out.println(department);
        }

    }
}
