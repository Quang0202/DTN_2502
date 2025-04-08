package com.programming.nhatanh.lesson5;

import com.vti.backend.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) throws ParseException {

        News news = new News();

        Scanner scanner = new Scanner(System.in);
        boolean validResponse = true;
        while (validResponse) {
            System.out.println("mời bạn nhập vào chức năng muốn sử dụng");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Ngừng chương trình");
            int inputRequestNumber = scanner.nextInt();
            switch (inputRequestNumber) {
                case 1:
                    System.out.println("Nhập Title: ");
                    String inputTitle = scanner.next();
                    System.out.println("Nhập PublishDate: ");
                    String inputPublishDate = scanner.next();
                    System.out.println("Nhập Author: ");
                    String inputAuthor = scanner.next();
                    System.out.println("Nhập Content: ");
                    String inputContent = scanner.next();
                    System.out.println("Nhập 3 đánh giá (số):");
                    int inputRating1 = scanner.nextInt();
                    int inputRating2 = scanner.nextInt();
                    int inputRating3 = scanner.nextInt();
                    int[] inputRatingArray = new int[]{inputRating1, inputRating2, inputRating3};
                    news.setTitle(inputTitle);
                    news.setPublishDate(inputPublishDate);
                    news.setAuthor(inputAuthor);
                    news.setContent(inputContent);
                    news.setRates(inputRatingArray);
                    break;
                case 2:
                   news.display();
                    break;
                case 3:
                    news.calculate();
                    break;
                case 4:
                    validResponse = false;
                    break;
                default:
                    System.out.println("Mời bạn nhập lại");
                    break;
            }
        }
        scanner.close();
    }
}
