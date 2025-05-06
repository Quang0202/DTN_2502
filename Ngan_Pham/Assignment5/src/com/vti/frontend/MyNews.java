package com.vti.frontend;

import com.vti.entity.News;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<News> newsList = new ArrayList<>();

        while (true) {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1 -> {
                    News news = new News();

                    System.out.print("Enter Title: ");
                    news.setTitle(scanner.nextLine());
                    System.out.print("Enter Publish Date: ");
                    news.setPublishDate(scanner.nextLine());
                    System.out.print("Enter Author: ");
                    news.setAuthor(scanner.nextLine());
                    System.out.print("Enter Content: ");
                    news.setContent(scanner.nextLine());

                    int[] rates = new int[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.printf("Enter rate %d (0-10): ", i + 1);
                        rates[i] = Integer.parseInt(scanner.nextLine());
                    }
                    news.setRates(rates);
                    newsList.add(news);
                    System.out.println("News inserted successfully!");
                }
                case 2 -> {
                    if (newsList.isEmpty()) {
                        System.out.println("No news available.");
                    } else {
                        for (News n : newsList) {
                            n.Display();
                            System.out.println("--------------");
                        }
                    }
                }
                case 3 -> {
                    if (newsList.isEmpty()) {
                        System.out.println("No news available.");
                    } else {
                        for (News n : newsList) {
                            n.Calculate();
                            n.Display();
                            System.out.println("--------------");
                        }
                    }
                }
                case 4 -> {
                    System.out.println("Exiting program.");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}
