import model.Account;
import model.Department;
import model.Group;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Department department = new Department();
        department.setDepartmentId(1);
        department.setDepartmentName("Sale");
        department.setAddress("Hà Nội");

        Department department1 = new Department();
        department1.setDepartmentId(2);
        department1.setDepartmentName("Sale");

        Department department2 = new Department();
        department2.setDepartmentId(3);
        department2.setDepartmentName("Marketing");

        Department department3 = new Department();
        department3.setDepartmentId(4);
        department3.setDepartmentName("Waiting room");

        Department department4 = new Department();
        department4.setDepartmentId(5);
        department4.setDepartmentName("Accounting");

        Department department5 = new Department();
        department5.setDepartmentId(6);
        department5.setDepartmentName("Sale");

        Department department6 = new Department();
        department6.setDepartmentId(7);
        department6.setDepartmentName("Boss of director");


        Department[] departments = {department, department1, department2, department3, department4, department5, department6};
        Group group = new Group();
        group.setGroupId(1);
        group.setGroupName("Golang Java");
        group.setCreateDate(LocalDate.parse("2022-01-12"));

        Group group1 = new Group();
        group1.setGroupId(2);
        group1.setGroupName("Java");
        group1.setCreateDate(LocalDate.parse("2023-01-12"));

        Group group2 = new Group();
        group2.setGroupId(3);
        group2.setGroupName("TestJavaGolang");
        group2.setCreateDate(LocalDate.parse("2024-11-12"));

        Group[] groups = {group, group1, group2};

//        question1();
//        question2();
//        question3();
//        question4();
//        exe2Question1();
//        exe3Question1();
//        exe3Question2();
//        exe3Question3();
//        exe4Question1();
//        exe4Question2();
//        exe4Question3();
//        exe4Question4();
//        exe4Question5();
//        exe4Question6();
//        exe4Question7();
//        exe4Question8(groups);
//        exe4Question9(groups);
//        exe4Question10();
//        exe4Question11();
//        exe4Question12();
//        exe4Question13();
//        exe4Question14();
//        exe4Question15();
//        exe4Question16();
//        exe5Question1(department);
//        exe5Question2(departments);
//        exe5Question3(department);
//        exe5Question4(department);
//        exe5Question5(department,department1);
//        exe5Question5(department,department2);
//        exe5Question6(departments);
//        exe5Question7(departments);
    }


    public static void question1() {
        float salary = 5240.5F;
        float salary2 = 10970.055F;
        System.out.println(Math.round(salary));
        System.out.println(Math.round(salary2));
    }

    public static void question2() {
        Random rand = new Random();
        String temp = String.valueOf(rand.nextInt(99999));
        if (temp.length() < 5) {
            for (int i = 0; i < 5 - temp.length(); i++) {
                temp = "0" + temp;
            }
        }
//        int num = rand.nextInt(99999);
//        System.out.printf("%05d", num);
        System.out.println(temp);
    }

    public static void question3() {
        Random rand = new Random();
        String temp = String.valueOf(rand.nextInt(99999));
        if (temp.length() < 5) {
            for (int i = 0; i < 5 - temp.length(); i++) {
                temp = "0" + temp;
            }
        }
//        int num = rand.nextInt(99999);
//        System.out.printf("%02d", num%100);
        System.out.println(temp.substring(temp.length() - 2));
    }

    public static void question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap so nguyen thu 1: ");
        int a = myObj.nextInt();
        System.out.println("Nhap so nguyen thu 2: ");
        int b = myObj.nextInt();
        System.out.println((float) a / b);
    }

    public static void exe2Question1() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < 5; i++) {
            Account account = new Account();
            account.setEmail("Email" + (i+1));
            account.setUserName("User name" + (i+1));
            account.setFullName("Full name" + (i+1));
            account.setCreateDate(LocalDate.now());
            accounts[i] = account;
        }
    }

    public static void exe3Question1() {
        Integer salary = 5000;
        System.out.printf("%.2f\n",  salary.floatValue());
    }

    public static void exe3Question2() {
        String value = "1234567";
        System.out.println(Integer.parseInt(value));
    }

    public static void exe3Question3() {
        Integer value = Integer.valueOf("1234567");
        System.out.println((int) value);
    }

    public static void exe4Question1() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap xau ky tu: ");
        String val = myObj.nextLine();
        System.out.println(val.length());
    }

    public static void exe4Question2() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap xau ky tu 1: ");
        String val1 = myObj.nextLine();
        System.out.println("Nhap xau ky tu 2: ");
        String val2 = myObj.nextLine();
        System.out.println(val1.concat(val2));
    }

    public static void exe4Question3() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String val1 = myObj.nextLine();
        System.out.println(String.valueOf(val1.charAt(0)).toUpperCase() + val1.substring(1));
    }

    public static void exe4Question4() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ten: ");
        String val1 = myObj.nextLine();
        for (int i = 0; i < val1.length(); i++) {
            System.out.println("Ký tự thứ " + (i + 1) + " là: " + String.valueOf(val1.charAt(i)).toUpperCase());
        }
    }

    public static void exe4Question5() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho: ");
        String val1 = myObj.nextLine();
        System.out.println("Nhap ten: ");
        String val2 = myObj.nextLine();
        System.out.println(val1 + " " + val2);
    }

    public static void exe4Question6() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine();
        String[] temp = val1.split(" ");
        System.out.println("Ho la: " + temp[0]);
        String tempName = "";
        for (int i = 0; i < temp.length - 1; i++) {
            if (i != 0) {
                tempName += temp[i];
            }
        }
        System.out.println("Ten dem la: " + tempName);
        System.out.println("Ten la: " + temp[temp.length - 1]);
    }

    public static void exe4Question7() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine().trim().toUpperCase();
//        Cach 1 xu ly nhanh bang ham
        String result = "";
        String[] temp = Arrays.stream(val1.split(" ")).filter(e -> !e.isEmpty()).toArray(String[]::new);
        for (String s : temp) {
            result += s.charAt(0) + s.substring(1).toLowerCase() + " ";
        }
        System.out.println(result.substring(0, result.length() - 1));

//       Cach 2 Xy ly bang vong lap for
//        String[] temp = val1.split(" ");
//        String name = "";
//        for (int i = 0; i < temp.length; i++) {
//            if (temp[i].isEmpty()) {
//                continue;
//            }
//            name += temp[i].charAt(0) + temp[i].substring(1).toLowerCase();
//            if (i == temp.length - 1) {
//                break;
//            }
//            name += " ";
//        }
//        System.out.println(name);
    }

    public static void exe4Question8(Group[] groups) {
        for (Group group : groups) {
            if (group.getGroupName().contains("Java")) {
                System.out.println(group);
            }
        }
    }

    public static void exe4Question9(Group[] groups) {
        for (Group group : groups) {
            if (group.getGroupName().equals("Java")) {
                System.out.println(group);
            }
        }
    }

    public static void exe4Question10() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi 1: ");
        String chuoi1 = myObj.nextLine();
        System.out.println("Nhap chuoi 2: ");
        String chuoi2 = myObj.next();

//        cach 1 xu ly bang vong lap for
//        boolean check = false;
//        if (chuoi1.isEmpty() || chuoi1.length() != chuoi2.length()) {
//            System.out.println("KO");
//        } else {
//            for (int i = 0; i < chuoi1.length(); i++) {
//                if (chuoi1.charAt(i) != chuoi2.charAt(chuoi1.length() - i - 1)) {
//                    check = false;
//                    System.out.println("KO");
//                    break;
//                }
//                check = true;
//            }
//        }
//        if (check) {
//            System.out.println("OK");
//        }

//        cach 2 xu ly nhanh bang ham
        if (chuoi2.contentEquals(new StringBuilder(chuoi1).reverse())) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    public static void exe4Question11() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
//        cach 1 xu ly bang for
//        int count = 0;
//        for (int i = 0; i < chuoi.length(); i++) {
//            if (chuoi.charAt(i) == 'a') {
//                count++;
//            }
//        }
//        System.out.println(count);

//        cach 2 xu ly bang indexOf
        int index = 0;
        int count = 0;
        while (true) {
            index = chuoi.indexOf("a", index + 1);
            if (index == -1) {
                break;
            }
            count++;
        }
        System.out.println(count);
    }

    public static void exe4Question12() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();

//        cach 1 dung vong lap for
//        String temp = "";
//        for (int i = chuoi.length() - 1; i >= 0; i--) {
//            temp += chuoi.charAt(i);
//        }
//        System.out.println(temp);

//        cach 2 xu ly nhanh bang ham
        System.out.println(new StringBuilder(chuoi).reverse().toString());
    }

    public static void exe4Question13() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();

//        cach 1 xu ly for
//        boolean check = false;
//        for (int i = 0; i < chuoi.length(); i++) {
//            if (Character.isDigit(chuoi.charAt(i))) {
//                check = false;
//                break;
//            }
//            check = true;
//        }
//        System.out.println(check);

//       cach 2 xu ly nhanh bang regular expression
        System.out.println(!chuoi.matches(".*\\d.*"));
    }

    public static void exe4Question14() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println("Nhap ky tu chi dinh: ");
        String kyTuChiDinh = myObj.nextLine();
        System.out.println("Nhap ky tu muon chuyen: ");
        String kyTuMuonChuyen = myObj.nextLine();
//        cach  1 dung for
//        String temp = "";
//        for (int i = 0; i < chuoi.length(); i++) {
//            if (chuoi.charAt(i) == kyTuChiDinh.charAt(0)) {
//                temp += kyTuMuonChuyen;
//            } else {
//                temp += chuoi.charAt(i);
//            }
//        }
//        System.out.println(temp);

//        cach 2 dung ham replace
        System.out.println(chuoi.replaceAll(kyTuChiDinh, kyTuMuonChuyen));
    }

    public static void exe4Question15() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String val1 = myObj.nextLine().trim();

//        cach 1 xu ly bang for
//        String[] temp = val1.split(" ");
//        String name = "";
//        for (int i = temp.length - 1; i >= 0; i--) {
//            if (temp[i].isEmpty()) {
//                continue;
//            }
//            name += temp[i];
//            if (i != 0) {
//                name += " ";
//            }
//        }
//
//
//        System.out.println(name);


//        cach 2 xu ly nhanh bang ham
        String[] temp = Arrays.stream(val1.split(" ")).filter(e -> !e.isEmpty()).toArray(String[]::new);
        Collections.reverse(Arrays.asList(temp));
        System.out.println(String.join(" ", temp));

    }

    public static void exe4Question16() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Nhap chuoi: ");
        String chuoi = myObj.nextLine();
        System.out.println("Nhap so nguyen n: ");
        int n = myObj.nextInt();
        if (chuoi.length() % n != 0) {
            System.out.println("KO");
        } else {
//            cach 1 xu ly chi tiet bang vong for
//            int count = 1;
//            String[] result = new String[chuoi.length() / n];
//            String temp = "";
//            for (int i = 0; i < chuoi.length(); i++) {
//                if(i <= n * count - 1){
//                    temp += chuoi.charAt(i);
//                    result[count - 1] = temp;
//                } else {
////                   reset temp
//                    temp = "";
//                    count++;
////                   check again index
//                    i--;
//                }
//            }
//            for (String s : result) {
//                System.out.println(s);
//            }

//            cach 2 xu ly nhanh bang ham
            int index = 0;
            int count = 0;
            String[] result = new String[chuoi.length() / n];
            while (index < chuoi.length()) {
                result[count] = chuoi.substring(index, Math.min(index + n, chuoi.length()));
                index += n;
                count++;
            }
            for (String s : result) {
                System.out.println(s);
            }
        }
    }

    public static void exe5Question1(Department department){
        System.out.println(department.toString());
    }

    public static void exe5Question2(Department[] departments){
        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }

    public static void exe5Question3(Department department){
        System.out.println(department.getAddress());
    }

    public static void exe5Question4(Department department){
        String nameCheck = "Phòng A";
        System.out.println(department.checkDepartmentName(nameCheck));
    }

    public static void exe5Question5(Department department1, Department department2){
        System.out.println(department1.compareDepartment(department2));
    }

    public static void exe5Question6(Department[] departments){
        bubbleSort(departments);
        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }

    public static void exe5Question7(Department[] departments){
        bubbleSort2(departments);
        for (Department department : departments) {
            System.out.println(department.toString());
        }
    }

    private static void bubbleSort(Department[] departments){
        boolean swapped = false;

        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = 0; j < departments.length - i - 1; j++) {
                Department temp;
                if (departments[j].getDepartmentName().toLowerCase().compareTo(departments[j + 1].getDepartmentName().toLowerCase()) > 0 ) {
                    temp = departments[j];
                    departments[j] = departments[j + 1];
                    departments[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, then break
            if (!swapped)
                break;
        }
    }

    private static void bubbleSort2(Department[] departments){
        boolean swapped = false;

        for (int i = 0; i < departments.length - 1; i++) {
            for (int j = 0; j < departments.length - i - 1; j++) {
                Department temp;
                String[] nameTemp1 = departments[j].getDepartmentName().split(" ");
                String[] nameTemp2 = departments[j + 1].getDepartmentName().split(" ");
                if (nameTemp1[nameTemp1.length-1].toLowerCase().compareTo(nameTemp2[nameTemp2.length-1].toLowerCase()) > 0 ) {
                    temp = departments[j];
                    departments[j] = departments[j + 1];
                    departments[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped, then break
            if (!swapped)
                break;
        }
    }


}