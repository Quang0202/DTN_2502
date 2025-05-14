package com.vti.frontend;

import com.vti.backend.Exercise4;
import com.vti.entity.Exercise4_Account;
import com.vti.entity.Student;

public class Program4 {
    public static void main(String[] args) {
        Student student1 = new Student("Hoang Khanh Linh", "Nghệ An");
        student1.setGPA(5.0);
        student1.plusPoint(4);
        student1.display();

        Exercise4 exercise4 = new Exercise4();
        exercise4.ques2();
    }
}
