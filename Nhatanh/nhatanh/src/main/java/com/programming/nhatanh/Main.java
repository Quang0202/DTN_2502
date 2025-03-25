package com.programming.nhatanh;

import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Locale e = Locale.JAPAN;
        LocalDateTime date = LocalDateTime.now();

        DateTimeFormatter d = DateTimeFormatter.ofPattern("EEEEE-MMMM-yyyy", e);
        System.out.println(d);
        String strDate = d.format(date);
        System.out.println(strDate);

        Random random = new Random();
        int randomInt = random.nextInt(10, 100);
        float randomFloat = random.nextFloat(10, 100);
        double randomDouble = random.nextDouble(10, 100);

    }
}