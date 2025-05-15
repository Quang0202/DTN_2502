package com.vti.frontend;

import com.vti.entity.Student;

public class Program4 {
    public static void main(String[] args) {
        // Tạo sinh viên mới (constructor tự động gán GPA = 0)
        Student student1 = new Student("Nguyen Van A", "Hanoi");
        student1.printInfo();

        // Set điểm học lực
        student1.setGpa(7.5);
        student1.printInfo();

        // Cộng thêm điểm
        student1.addGpa(1.0);
        student1.printInfo();

        // Tạo sinh viên khác và thử nghiệm các case khác nhau
        Student student2 = new Student("Le Thi B", "Ho Chi Minh");
        student2.setGpa(3.0);
        student2.printInfo();

        student2.addGpa(2.5);
        student2.printInfo();

        student2.addGpa(5.0); // Thử cộng điểm vượt quá 10
        student2.printInfo();
    }
}
