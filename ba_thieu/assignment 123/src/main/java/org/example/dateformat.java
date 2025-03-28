package org.example;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class dateformat {
    public static void main(String[] args) {
        // Tạo đối tượng Exam
        Exam exam1 = new Exam();
        exam1.id = 1;
        exam1.code = "ha";
        exam1.title = "tracnghiem";
        exam1.createDate = LocalDate.parse("2014-12-12");

        Exam exam2 = new Exam();
        exam2.id = 2;  // Sửa lại exam2
        exam2.code = "hi";
        exam2.title = "tuluan";
        exam2.createDate = LocalDate.parse("2014-12-20");

        // Tạo mảng chứa các Exam
        Exam[] exams = {exam1, exam2};

        // Question 1 - Định dạng "dd/MM/yyyy"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        for (Exam exam : exams) {
            System.out.println(exam.code + ": " + exam.createDate.format(formatter));
        }

        // Question 2 - Định dạng "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        for (Exam exam : exams) {
            System.out.println(exam.code + ": " + exam.createDate.atStartOfDay().format(formatter1));
        }

        // Question 3 - Chỉ lấy "yyyy"
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy");
        for (Exam exam : exams) {
            System.out.println(exam.code + ": " + exam.createDate.format(formatter2));
        }

        // Question 4 - Định dạng "yyyy-MM"
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("yyyy-MM");
        for (Exam exam : exams) {
            System.out.println(exam.code + ": " + exam.createDate.format(formatter3));
        }

        // Question 5 - Định dạng "MM-dd"
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("MM-dd");
        for (Exam exam : exams) {
            System.out.println(exam.code + ": " + exam.createDate.format(formatter4));
        }
    }
}


