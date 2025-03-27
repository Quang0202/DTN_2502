import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
//EXERCISE 4 :
        // Question 1:In ngẫu nhiên ra 1 số nguyên
//        Scanner sc = new Scanner(System.in);
//        System.out.println("vui long nhap vao so a: ");
//        int a = sc.nextInt();
//        System.out.println("so nguyen vua nhap la "+a);

        //Question 2 : In ngẫu nhiên ra 1 số thực
//        System.out.println("vui long nhap vao so thuc: ");
//        float b = sc.nextFloat();
//        System.out.println("so thuc vua nhap la "+b);

        //Question 3 :Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
//        Random rd = new Random();
//        String[] str = new String[2];
//        str = new String[]{"nguyen xuan tai", "hoang anh","Manh an"};
//      int rand = rd.nextInt(str.length);
//      System.out.println(str[rand]);

        //Question 4 : Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
//        LocalDate startDate = LocalDate.of(1995, 7, 24);
//        LocalDate endDate = LocalDate.of(1995, 12, 20);
//        Random random = new Random();
//        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
//        long randomDays = random.nextLong(daysBetween + 1);
//        LocalDate randomDate = startDate.plusDays(randomDays);
//        System.out.println("Ngày ngẫu nhiên: " + randomDate);

        // Question 5 : Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
//
//        LocalDate start = LocalDate.now();
//        LocalDate end = start.minusYears(1);
//        int randomDays1 = new Random().nextInt((int) start.toEpochDay() - (int) end.toEpochDay() + 1);
//        LocalDate randomDate1 = end.plusDays(randomDays1); // Cộng số ngày ngẫu nhiên
//
//        System.out.println("Ngày ngẫu nhiên: " + randomDate1);


        // Question 6 : Lấy ngẫu nhiên 1 ngày trong quá khứ
//        LocalDate start6 = LocalDate.now();
//        LocalDate end6 = start6.minusYears(1000);
//        int random6 = new Random().nextInt((int) start6.toEpochDay() - (int) end6.toEpochDay() + 1);
//        LocalDate randomDate2 = end6.plusDays(random6);
//        System.out.println("ngay ngau nhien trong qua khu " + randomDate2);
//
        // Question 7 : lay ngau nhien 1 so co 3 chu so

//        Random rand = new Random();
//        int a = rand.nextInt(900)+100;
//        System.out.println("ngay ngau nhien  " + a);


        // Ex5 :
        //Question 1 :  Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình

        Scanner sc = new Scanner(System.in);
//        int num1,num2,num3;
//
//        System.out.print("Nhập số thứ nhất: ");
//        while (!sc.hasNextInt()) {
//            System.out.println("Lỗi! Vui lòng nhập một số nguyên.");
//            sc.nextLine();
//        }
//        num1 = sc.nextInt();
//        System.out.println("so nguyen cua ban la " + num1);
//        sc.nextLine();
//        System.out.print("Nhập số thứ 2: ");
//        num2 = sc.nextInt();
//        System.out.println("so nguyen cua ban la " +  num2 );
//        sc.nextLine();
//        System.out.print("Nhập số thứ 3: ");
//        num3 = sc.nextInt();
//        System.out.println("so nguyen cua ban la " +  num3 );
//        sc.nextLine();
//
//        //Question 2: Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình
//        System.out.println("vui long nhap so thuc 1  ");
//        float a = sc.nextFloat();
//        System.out.println("so thuc a  " + a);
//
//        System.out.println("vui long nhap so thuc 2" );
//        float b = sc.nextFloat();
//        System.out.println("so thuc b  " + b);
//        sc.nextLine();
//        sc.close();

        // Question 3 : Viết lệnh cho phép người dùng nhập họ và tên
//        System.out.println("vui long nhap ten ");
//        String NAME = sc.next();
//        System.out.println("name " + NAME);

        //Question 4 :Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.print("Nhập ngày sinh của bạn (dd/MM/yyyy): ");
//        String input = sc.nextLine();
//
//        LocalDate birthday = LocalDate.parse(input, formatter);
//
//        System.out.println("Ngày sinh của bạn là: " + birthday.format(formatter));
//
//        sc.close();

      //Question 6 :Viết lệnh cho phép người dùng tạo department (viết thành method)
//        Department department = new Department();
//        System.out.println("nhap id");
//        department.id = sc.nextInt();
//        sc.nextLine();
//        System.out.println("nhap nama");
//        department.DepartmentName = sc.nextLine();
//
//        System.out.println("full thong tin" + department.toString());

        //Question 7 : Nhap so chan tu console
//        int x = sc.nextInt();
      do {

          int x ;
          System.out.println("vui long nhap so chan :");
          x = sc.nextInt();
          if(x%2==0) {
              System.out.println("so chan do la :" +x);
              break;
          }else {
              System.out.println("vui long nhap lai");
          }
      }while (true);


    }
    }
