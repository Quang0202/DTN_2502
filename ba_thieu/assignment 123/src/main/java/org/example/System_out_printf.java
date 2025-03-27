package org.example;

import java.text.NumberFormat;
import java.util.Locale;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class System_out_printf {
    public static void main(String[] args) {
        // question 1
        int soNguyen1 = 5;
        System.out.printf("%d%n", soNguyen1);


        // question 2
        int soNguyen2 =100000000;
        NumberFormat us = NumberFormat.getInstance(Locale.US);
        System.out.println(us.format(soNguyen2));
        // question 3
        float soThuc1 = 5.567098f;
        System.out.printf("%.4f", soThuc1);
        // question 4
        String hoVaTen = "Nguyen Van A" ;
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân.%n", hoVaTen);
        // question 5
        // Lấy thời gian hiện tại
        LocalDateTime now = LocalDateTime.now();

        // Định dạng theo yêu cầu: dd/MM/yyyy HH'h':mm'p':ss's'
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");

        // In ra kết quả
        String formattedTime = now.format(formatter);
        System.out.println(formattedTime);
        // question 6
    }
}

