package com.programming.nhatanh.lesson8.frontend;

import com.programming.nhatanh.lesson8.entity.Student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Exercise2 {
    public static void main(String[] args)  {

//        Nguyễn Văn Nam, Nguyễn Văn Huyên, Trần Văn Nam, Nguyễn Văn A
//        a) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự sớm
//        nhất tới muộn nhất (gợi ý dùng Stack)
//        b) Tạo 1 method để in ra thứ tự tới của các học sinh theo thứ tự từ
//        muộn nhất tới sớm nhất (gợi ý dùng Queue)

        String[] names = {"Nguyễn Văn Nam", "Nguyễn Văn Huyên", "Trần Văn Nam", "Nguyễn Văn A"};

        Stack<Student> studentStack = new Stack<>();
        Queue<Student> studentQueue = new LinkedList<Student>();;
        for(int i = 0; i < 4; i++){
            Student newStudent = new Student(i, names[i]);
            studentStack.push(newStudent);
            studentQueue.add(newStudent);
        }

        for(Student i : studentStack){
            System.out.println(i);
        }

        for (Student i : studentQueue){
            System.out.println(i);
        }



    }
}
