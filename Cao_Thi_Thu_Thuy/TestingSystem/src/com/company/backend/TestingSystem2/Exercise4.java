package com.company.backend.TestingSystem2;

import java.time.LocalDate;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Exercise4 {
    public void q1(){
        Random random = new Random();
        System.out.println(random.nextInt());
    }
    public void q2(){
        Random random = new Random();
        System.out.println(random.nextFloat());
    }
    public void q3(){
        String[] names = {"Mai", "Lan", "Cúc", "Trúc"};
        Random random = new Random();
        System.out.printf("Tên ngẫu nhiên được chọn là: %s", names[random.nextInt(names.length)]);
    }
    public void q4(){
        Random random = new Random();
        LocalDate startDate = LocalDate.of(1995, 7, 4);
        long numStartDate = startDate.toEpochDay(); // Số ngày từ epoch

        LocalDate endDate = LocalDate.of(1995, 12, 20);
        long numEndDate = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().nextLong(numStartDate, numEndDate + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
        System.out.println("Ngày ngẫu nhiên: " + randomDate);
    }
    public void q5(){
        Random random = new Random();
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = LocalDate.of(endDate.getYear()-1, endDate.getMonth(), endDate.getDayOfMonth());
        long numStartDate = startDate.toEpochDay(); // Số ngày từ epoch
        long numEndDate = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().nextLong(numStartDate, numEndDate + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
        System.out.println("Ngày ngẫu nhiên: " + randomDate);
    }
    public void q6(){
        Random random = new Random();
        LocalDate endDate = LocalDate.now();
        long numEndDate = endDate.toEpochDay();
        long randomEpochDay = ThreadLocalRandom.current().nextLong(numEndDate + 1);
        LocalDate randomDate = LocalDate.ofEpochDay(randomEpochDay);
        System.out.println("Ngày ngẫu nhiên: " + randomDate);
    }
    public void q7(){
        int random = ThreadLocalRandom.current().nextInt(100, 1000);
        System.out.println("Số ngẫu nhiên: " + random);
    }
}
