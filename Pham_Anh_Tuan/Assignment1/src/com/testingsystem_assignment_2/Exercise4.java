package com.testingsystem_assignment_2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class Exercise4 {
    public static void main(String[] args) {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
    }

    //Question 1: In ngẫu nhiên ra 1 số nguyên
    public static void question1() {
        System.out.println("Question 1: In ngẫu nhiên ra 1 số nguyên");
        Random random = new Random();
        int number = random.nextInt();
        System.out.println("So nguyen ngau nhien la: " + number);
    }

    // Question 2: In ngẫu nhiên ra 1 số thực

    public static void question2() {
        System.out.println("Question 2: In ngẫu nhiên ra 1 số thực");
        Random random = new Random();
        float number = random.nextFloat();
        System.out.println("So nguyen ngau nhien la: " + number);
    }

    //Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn
    public static void question3() {
        System.out.println("Question 3: Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên ra tên của 1 bạn");
        String[] students = {"Tuấn 1", "Tuấn New", "Tuấn Nai Xừ", "Duy", "Hoa", "Lan", "Minh", "Tuấn 2", "Phát", "Quang"};

        Random random = new Random();
        int index = random.nextInt(students.length);
        System.out.println("Bạn được chọn ngẫu nhiên: " + students[index]);
    }

    // Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995
    public static void question4() {
        System.out.println("Question 4: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-1995");
        LocalDate startDate = LocalDate.of(1995, 7, 24);
        LocalDate endDate = LocalDate.of(1995, 12, 20);

        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        Random random = new Random();
        long randomDays = random.nextInt((int) daysBetween + 1);

        LocalDate randomDate = startDate.plusDays(randomDays);
        System.out.println("Ngày ngẫu nhiên: " + randomDate);
    }


    //Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
    public static void question5() {
        System.out.println("Question 5: Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây");
        LocalDate today = LocalDate.now();
        LocalDate lastYear = today.minusYears(1);

        long daysBetween = ChronoUnit.DAYS.between(lastYear, today);
        Random random = new Random();
        long randomDays = random.nextInt((int) daysBetween + 1);

        LocalDate randomDate = lastYear.plusDays(randomDays);
        System.out.println("Ngày ngẫu nhiên trong 1 năm qua: " + randomDate);
    }
    //Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ
    public static void question6() {
        System.out.println("Question 6: Lấy ngẫu nhiên 1 ngày trong quá khứ");
        int randomYear = new Random().nextInt(2023) + 1;
        int randomMonth = new Random().nextInt(12) + 1;
        int randomDay = new Random().nextInt(28) + 1;

        LocalDate randomPastDate = LocalDate.of(randomYear, randomMonth, randomDay);
        System.out.println("Ngày ngẫu nhiên trong quá khứ: " + randomPastDate);


    }
    //Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số
    public static void question7() {
        System.out.println("Question 7: Lấy ngẫu nhiên 1 số có 3 chữ số");
        Random random = new Random();
        int randomNumber = random.nextInt(900) + 100;
        System.out.println("Số ngẫu nhiên có 3 chữ số: " + randomNumber);
    }
}
