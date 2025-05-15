package com.testingsystem_assignment_2;

import com.testingsystem_assignment_1.Exam;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Exercise3 {
   public static Exam exam1 = new Exam(1, "Java Programming", new Date());
    public static void main(String[] args) {
            question1();
            question2();
            question3();
            question4();
            question5();
    }

    public static void question1() {
        // QUESTION 1: In thông tin Exam thứ 1 với ngày giờ theo định dạng Vietnamese

        System.out.println("Question 1:");
        SimpleDateFormat vietnameseFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss", new Locale("vi", "VN"));
        System.out.printf("Exam ID: %d, Title: %s, Create Date: %s%n",
                exam1.examId, exam1.title, vietnameseFormat.format(exam1.createDate));
        System.out.println();
    }

    public static void question2() {
        // QUESTION 2: In ngày giờ theo định dạng năm-tháng-ngày-giờ-phút-giây
        System.out.println("Question 2:");
        SimpleDateFormat fullFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.printf("Exam created on: %s%n", fullFormat.format(exam1.createDate));
        System.out.println();

    }

    public static void question3() {
        // QUESTION 3: Chỉ in ra năm của create date
        System.out.println("Question 3:");
        SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");
        System.out.printf("Year: %s%n", yearFormat.format(exam1.createDate));
        System.out.println();

    }

    public static void question4() {
        // QUESTION 4: Chỉ in ra tháng và năm của create date
        System.out.println("Question 4:");
        SimpleDateFormat monthYearFormat = new SimpleDateFormat("MM-yyyy");
        System.out.printf("Month-Year: %s%n", monthYearFormat.format(exam1.createDate));
        System.out.println();

    }

    public static void question5() {
        // QUESTION 5: Chỉ in ra "MM-DD" của create date
        System.out.println("Question 5:");
        SimpleDateFormat monthDayFormat = new SimpleDateFormat("MM-dd");
        System.out.printf("MM-DD: %s%n", monthDayFormat.format(exam1.createDate));
    }
}
