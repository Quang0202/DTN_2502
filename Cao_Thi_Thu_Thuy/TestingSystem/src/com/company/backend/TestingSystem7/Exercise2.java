package com.company.backend.TestingSystem7;

import com.company.entity.TestingSystem7.MyMath;
import com.company.entity.TestingSystem7.PrimaryStudent;
import com.company.entity.TestingSystem7.SecondaryStudent;
import com.company.entity.TestingSystem7.Student;

public class Exercise2 {
    public void q1(){
        System.out.println(MyMath.sum(3));
    }
    public void q3(){
        try {
            Student s1 = new PrimaryStudent(1, "An");
            SecondaryStudent s2 = new SecondaryStudent(2, "Bình");
            s1.study();
            s2.study();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public void q4(){

    }
}
