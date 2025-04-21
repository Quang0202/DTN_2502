package backend;

import entity.*;

public class Exercise1 {
//    Question 1: static variable
//    Khai báo 1 class student có các thuộc tính id, name, college Với college là static variable.
//    Hãy khởi tạo các student sau:
//    Student có id = 1, name ="Nguyễn Văn A"
//    Student có id = 2, name = " Nguyễn Văn B "
//    Student có id = 3, name = " Nguyễn Văn C "
//    Và tất cả các student này đều học ở "Đại học bách khoa".
//    Dùng vòng for để in ra thông tin các student
//    Sau đó hãy chuyển các student này sang "Đại học công nghệ"
//    Dùng vòng for để in ra thông tin các student
    public void question1() {
        Student.college = "Đại học Bách Khoa";

        Student[] students = {
                new Student(1, "Nguyễn Văn A"),
                new Student(2, "Nguyễn Văn B"),
                new Student(3, "Nguyễn Văn C")
        };

        System.out.println("Thông tin sinh viên ban đầu:");
        for (Student s : students) {
            s.display();
        }
        Student.college = "Đại học Công Nghệ";

        System.out.println("\nThông tin sinh viên sau khi chuyển trường:");
        for (Student s : students) {
            s.display();
        }
    }

//    Tiếp tục question 1
//    Bổ sung thuộc tính moneyGroup cho Student (moneyGroup là tiền quỹ lớp - dùng chung cho tất cả các student).
//    Hãy viết chương trình main() để mô tả các bước sau:
//    B1: Các Student sẽ nộp quỹ, mỗi Student 100k
//    B2: Student thứ 1 lấy 50k đi mua bim bim, kẹo về liên hoan
//    B3: Student thứ 2 lấy 20k đi mua bánh mì
//    B4: Student thứ 3 lấy 150k đi mua đồ dùng học tập cho nhóm
//    B5: cả nhóm mỗi người lại đóng quỹ mỗi người 50k
//    In ra số tiền còn của nhóm tại mỗi bước
    public void question2() {
        Student.college = "Đại học Bách Khoa";

        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");
        Student s3 = new Student(3, "Nguyễn Văn C");

        System.out.println("---- B1: Đóng quỹ mỗi người 100k ----");
        s1.contributeMoney(100);
        s2.contributeMoney(100);
        s3.contributeMoney(100);

        System.out.println("\n---- B2: Student 1 mua bim bim ----");
        s1.spendMoney(50, "mua bim bim, kẹo về liên hoan");

        System.out.println("\n---- B3: Student 2 mua bánh mì ----");
        s2.spendMoney(20, "mua bánh mì");

        System.out.println("\n---- B4: Student 3 mua đồ dùng học tập ----");
        s3.spendMoney(150, "đi mua đồ dùng học tập cho nhóm");

        System.out.println("\n---- B5: Mỗi người đóng thêm 50k ----");
        s1.contributeMoney(50);
        s2.contributeMoney(50);
        s3.contributeMoney(50);
    }

//    a) Viết class MyMath để thay thế cho class Math của java.
//    b) Viết thêm method min(), sum vào class MyMath
    public void question3() {
        int resultMax = MyMath.max(5, 7);
        int resultMin = MyMath.min(5, 7);
        int resultSum = MyMath.sum(5, 7);

        System.out.println("Max: " + resultMax);
        System.out.println("Min: " + resultMin);
        System.out.println("Sum: " + resultSum);
    }


//    Tiếp tục Question 1,Trong class Student
//.   a) Viết method cho phép thay đổi college
//    b) Viết method cho phép lấy giá trị của college
    public void question4() {
        Student.setCollege( "Đại học Bách Khoa");

        Student[] students = {
                new Student(1, "Nguyễn Văn A"),
                new Student(2, "Nguyễn Văn B"),
                new Student(3, "Nguyễn Văn C")
        };

        System.out.println("Thông tin sinh viên ban đầu:");
        for (Student s : students) {
            s.display();
        }
        System.out.println("Thông tin sinh viên đã thay đổi:");
        Student.setCollege( "Đại học Công Nghệ");
        for (Student s : students) {
            s.getCollege();
            s.display();
        }

    }
//    Hãy viết chương trình đếm số Student được sinh ra (tham khảo code trên google)
    public void question5() {
        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");
        Student s3 = new Student(3, "Nguyễn Văn C");

        System.out.println("Tổng số student được tạo ra: " + Student.getCountStudent());
    }

//    Tiếp tục Question 5
//    Tạo class PrimaryStudent, SecondaryStudent, hãy viết chương trình đếm số lượng PrimaryStudent được sinh ra, SecondaryStudent được sinh ra.
//    Viết chương trình demo.
//    Khởi tạo 6 Student, trong đó có 2 PrimaryStudent và 4
//    SecondaryStudent, sau đó in ra số lượng Student,
//    PrimaryStudent, SecondaryStudent được sinh ra.
    public void question6() {
        PrimaryStudent p1 = new PrimaryStudent(1, "Học sinh tiểu học A");
        PrimaryStudent p2 = new PrimaryStudent(2, "Học sinh tiểu học B");

        SecondaryStudent s1 = new SecondaryStudent(3, "Học sinh THCS A");
        SecondaryStudent s2 = new SecondaryStudent(4, "Học sinh THCS B");
        SecondaryStudent s3 = new SecondaryStudent(5, "Học sinh THCS C");
        SecondaryStudent s4 = new SecondaryStudent(6, "Học sinh THCS D");

        System.out.println("Tổng số Student: " + Student.getCountStudent());
        System.out.println("Số lượng PrimaryStudent: " + PrimaryStudent.getPrimaryCount());
        System.out.println("Số lượng SecondaryStudent: " + SecondaryStudent.getSecondaryCount());
    }

//   Tiếp tục Question 6 Chỉ cho phép user tạo được tối đa 7 học sinh
    public void question7() {
        try {
            PrimaryStudent pri1 = new PrimaryStudent(1, "Tiểu học A");
            PrimaryStudent pri2 = new PrimaryStudent(2, "Tiểu học B");
            SecondaryStudent sec1 = new SecondaryStudent(3, "THCS A");
            SecondaryStudent sec2 = new SecondaryStudent(4, "THCS B");
            SecondaryStudent sec3 = new SecondaryStudent(5, "THCS C");
            SecondaryStudent sec4 = new SecondaryStudent(6, "THCS D");
            SecondaryStudent sec5 = new SecondaryStudent(7, "THCS E");

            // Học sinh thứ 8 - sẽ bị lỗi
            SecondaryStudent sec6 = new SecondaryStudent(8, "THCS F"); // Sẽ ném exception

        } catch (RuntimeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        // In ra số lượng
        System.out.println("Tổng số Student: " + Student.getCountStudent());
    }

//    Tạo class Configs có các static property
//            SO_LUONG_HINH_TOI_DA = 5;
//    Tạo class HinhHoc, và class HinhTron, HinhChuNhat sẽ kế thừa từ class HinhHoc, implement method tính chu vi, diện tính
//    Viết chương trình chỉ cho phép khởi tạo được tối đa 5 hình, nếu người dùng khởi tạo tới hình thứ 6 thì sẽ throw ra 1 custom Exception có tên
//    là HinhHocException có message là: "Số lượng hình tối đa là: " + Configs. SO_LUONG_HINH_TOI_DA
    public void question8() {
        try {
            new HinhTron(2);
            new HinhTron(3);
            new HinhChuNhat(2, 4);
            new HinhChuNhat(3, 5);
            new HinhTron(1.5);

            // Hình thứ 6 - vượt giới hạn
            new HinhChuNhat(2, 2);

        } catch (HinhHocException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        System.out.println("Số lượng hình đã tạo: " + HinhHoc.getSoLuongHinh());
    }

//    Thay đổi các method ở class ScannerUtils ở Assignment 6 thành static để tiện dùng hơn
    public void question9() {
        int x = ScannerUtils.inputInt("Nhập số nguyên: ");
    }
}
