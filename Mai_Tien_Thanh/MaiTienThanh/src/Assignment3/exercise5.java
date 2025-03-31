package Assignment3;
import model.Department;

import java.util.Arrays;
import java.util.Comparator;

public class exercise5 {
    public static void main(String[] args) {

        Department[] departments = {
                new Department(1, "Accounting"),
                new Department(2, "Boss of director"),
                new Department(3, "Marketing"),
                new Department(4, "Sale"),
                new Department(5, "Waiting Room"),
        };

        //question1
        System.out.println(departments[1].toString());

        //question2
        System.out.println(departments.toString());

        //question3
        System.out.println(System.identityHashCode(departments[1]));

        //question4
        if(departments[1].getDepartmentName().equals("Phòng A")){
            System.out.println("Phòng ban thứ nhất có tên Phòng A");
        }else{
            System.out.println("Phòng ban thứ nhất không phải tên Phòng A");
        }

        //question6
        Arrays.sort(departments, Comparator.comparing(Department::getDepartmentName));
        System.out.println("Danh sách phòng bàn sắp xếp theo tên: ");
        for(Department department : departments){
            System.out.println(department.toString());
        }
    }

}