package vti.be.assignmentday07.exercise02;
//Tạo 1 array departments gồm 3 phần tử
//Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ index trong array departments.
//Nếu index vượt quá length lấy ra thì sẽ in ra text "Cannot find department."

import vti.data.Department;

import java.util.Scanner;

public class Question04 {

    public static void getindex( int index) {
        Department[] departments = new Department[3];
        departments[0] = new Department(1, "HR");
        departments[1] = new Department(2, "DEV");
        departments[2] = new Department(3, "SYS");
        System.out.println(departments[index]);
    }
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index of departments");
        int index = sc.nextInt();
        if( index > 3 ) {
            throw new Exception("Cannot find department");
        } else {
            getindex(index);
        }

    }
}
