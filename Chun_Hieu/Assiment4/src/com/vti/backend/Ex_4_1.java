package com.vti.backend;

import com.vti.entity.Student;

public class Ex_4_1 {
    public void question4(){
        Student student = new Student("Chun", "Ha Noi");
        student.setDiem(3);
        student.thongtinSv();
        student.congthemDiem(4.5f);
        student.thongtinSv();
        student.congthemDiem(1.5f);
        student.thongtinSv();
    }

}
