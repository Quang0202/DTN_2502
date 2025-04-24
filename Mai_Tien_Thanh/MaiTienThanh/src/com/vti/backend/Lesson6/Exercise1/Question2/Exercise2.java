package MaiTienThanh.src.com.vti.backend.Lesson6.Exercise1.Question2;

import MaiTienThanh.src.com.vti.entity.Department;
import MaiTienThanh.src.com.vti.entity.Account;
import MaiTienThanh.src.com.vti.entity.Group;
import MaiTienThanh.src.com.vti.entity.Lesson6.ScannerUtils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {

    Department[] departments = new Department[3];
    public float division(int a, int b) {
        return a / b;
    }

    public void question1() {
        int a = 7;
        int b = 0;
        try {
            float result = division(7, 0);
            System.out.println("Hiệu của " + a + "và " + b + "là: " + result);
        } catch (Exception e) {
            System.out.println("Không thể chia cho 0");
        } finally {
            System.out.println("Đã hoàn thành phép chia");
        }
    }

    public void question3() {
        int[] numbers = {1, 2, 3};
        try{
            System.out.println(numbers[10]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public void question4() {
        departments[1] = new Department();
        departments[2] = new Department();
        departments[3] = new Department();

        try{
            getIndex(1);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Không thể tìm thấy department");
        }
    }

    private void getIndex(int index) {
        System.out.println(departments[index].toString());
    }

    public void question5(){
        System.out.println(inputAge());
    }
    private int inputAge() {
        Scanner sc = new Scanner(System.in);
        int age = -1;

        while(true){
            System.out.print("Nhập tuổi của bạn: ");
            try{
                age = sc.nextInt();
                if (age <= 0) {
                    System.out.println("Wrong inputing! The age age must be greater than 0");
                }
                else{
                    return age;
                }
            }catch(InputMismatchException e){
                System.out.println("Wrong inputing! Please input an age as int, input again.");
                sc.nextLine();
            }
        }
    }
    public void question7(){
        ScannerUtils scannerUtils = new ScannerUtils();
        System.out.println(scannerUtils.inputInt("Please input integer"));
    }
    public void question8(){
        ScannerUtils scannerUtils = new ScannerUtils();
        System.out.println(scannerUtils.inputFloat("Please input a float number"));
    }
    public void question9(){
        Department department = new Department();
        System.out.println(department);
    }
    public void question10(){
        Group group = new Group();
        System.out.println(group);
    }
    public void question11() throws InvalidAgeInputingException {
        Account account = new Account();
        System.out.println("Age set to: " + account.inputAge());
    }
    public void question12(){
        Account account = new Account();
        System.out.println("Age set to: " + account.inputAccountAge());
        int[] ints = new int[0];
        System.out.println(ints.length);
    }
}
