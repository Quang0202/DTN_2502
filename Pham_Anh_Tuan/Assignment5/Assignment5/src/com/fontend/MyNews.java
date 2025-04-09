package com.fontend;

import com.entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<News> newsList = new ArrayList<>();
        int choice;

        while (true) {
            System.out.println("========== MENU ==========");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    News news = new News();
                    System.out.print("Enter Title: ");
                    news.setTitle(sc.nextLine());
                    System.out.print("Enter Publish Date: ");
                    news.setPublishDate(sc.nextLine());
                    System.out.print("Enter Author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.print("Enter Content: ");
                    news.setContent(sc.nextLine());
                    news.inputRates(sc);

                    newsList.add(news);
                    break;

                case 2:
                    for (News n : newsList) {
                        n.display();
                    }
                    break;

                case 3:
                    for (News n : newsList) {
                        n.calculate();
                        n.display();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
