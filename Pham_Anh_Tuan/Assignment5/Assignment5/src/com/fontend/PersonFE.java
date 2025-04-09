package com.fontend;

import com.entity.Student2;

public class PersonFE {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.inputInfo();

        System.out.println("\nThông tin sinh viên:");
        s.showInfo();

        if (s.hasScholarship()) {
            System.out.println("==> Sinh viên được học bổng.");
        } else {
            System.out.println("==> Sinh viên KHÔNG được học bổng.");
        }
    }
}
