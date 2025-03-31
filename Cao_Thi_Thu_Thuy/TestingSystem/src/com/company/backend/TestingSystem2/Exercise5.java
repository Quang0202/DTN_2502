package com.company.backend.TestingSystem2;

import java.util.Scanner;

public class Exercise5 {
    public void q1(){
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.printf("Nhập số thứ %d : ", i + 1);
            while (true){
                if (scanner.hasNextInt()){
                    array[i] = scanner.nextInt();
                    break;
                } else{
                    System.out.printf("Nhập lại số thứ %d : ", i + 1);
                    scanner.next();
                }
            }
        }
        scanner.close();
    }
    public void q2(){
        float[] array = new float[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++){
            System.out.printf("Nhập số thứ %d : ", i + 1);
            while (true){
                if (scanner.hasNextFloat()){
                    array[i] = scanner.nextFloat();
                    break;
                } else{
                    System.out.printf("Nhập lại số thứ %d : ", i + 1);
                    scanner.next();
                }
            }
        }
        scanner.close();
    }
}
