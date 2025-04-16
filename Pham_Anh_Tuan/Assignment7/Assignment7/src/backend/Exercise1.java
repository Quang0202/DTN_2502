package backend;

import entity.*;

public class Exercise1 {
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
        s1.spendMoney(50, "mua bim bim, kẹo");

        System.out.println("\n---- B3: Student 2 mua bánh mì ----");
        s2.spendMoney(20, "mua bánh mì");

        System.out.println("\n---- B4: Student 3 mua đồ dùng học tập ----");
        s3.spendMoney(150, "mua đồ dùng học tập");

        System.out.println("\n---- B5: Mỗi người đóng thêm 50k ----");
        s1.contributeMoney(50);
        s2.contributeMoney(50);
        s3.contributeMoney(50);
    }

    public void question3() {
        int resultMax = MyMath.max(5, 7);
        int resultMin = MyMath.min(5, 7);
        int resultSum = MyMath.sum(5, 7);

        System.out.println("Max: " + resultMax); // 7
        System.out.println("Min: " + resultMin); // 5
        System.out.println("Sum: " + resultSum); // 12
    }


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
    public void question5() {
        Student s1 = new Student(1, "Nguyễn Văn A");
        Student s2 = new Student(2, "Nguyễn Văn B");
        Student s3 = new Student(3, "Nguyễn Văn C");

        System.out.println("Tổng số student được tạo ra: " + Student.getCountStudent());
    }

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

    public void question7() {
        try {
            // Tổng cộng 7 học sinh
            PrimaryStudent p1 = new PrimaryStudent(1, "Tiểu học A");
            PrimaryStudent p2 = new PrimaryStudent(2, "Tiểu học B");
            SecondaryStudent s1 = new SecondaryStudent(3, "THCS A");
            SecondaryStudent s2 = new SecondaryStudent(4, "THCS B");
            SecondaryStudent s3 = new SecondaryStudent(5, "THCS C");
            SecondaryStudent s4 = new SecondaryStudent(6, "THCS D");
            SecondaryStudent s5 = new SecondaryStudent(7, "THCS E");

            // Học sinh thứ 8 - sẽ bị lỗi
            SecondaryStudent s6 = new SecondaryStudent(8, "THCS F"); // Sẽ ném exception

        } catch (RuntimeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        // In ra số lượng
        System.out.println("Tổng số Student: " + Student.getCountStudent());
    }

    public void question8() {
        try {
            new HinhTron(2);
            new HinhTron(3);
            new HinhChuNhat(2, 4);
            new HinhChuNhat(3, 5);
            new HinhTron(1.5);

            // Hình thứ 6 - vượt giới hạn
            new HinhChuNhat(2, 2); // Exception được ném ở đây

        } catch (HinhHocException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }

        System.out.println("Số lượng hình đã tạo: " + HinhHoc.getSoLuongHinh());
    }

    public void question9() {
        int x = ScannerUtils.inputInt("Nhập số nguyên: ");
    }
}
