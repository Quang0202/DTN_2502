package com.vti.frontend;

import com.vti.entity.News;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        ArrayList<News> newsList = new ArrayList<News>();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("-----Menu---- ");
            System.out.println("1. Insert News ");
            System.out.println("2. View list News ");
            System.out.println("3. Average rate ");
            System.out.println("4. Exit ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    News news = new News();
                    System.out.println("Enter News Title: ");
                    news.setTitle(sc.nextLine());
                    System.out.println("Enter News Author: ");
                    news.setAuthor(sc.nextLine());
                    System.out.println("Enter News Date: ");
                    news.setPublishDate(sc.nextLine());
                    System.out.println("Enter News Content: ");
                    news.setContent(sc.nextLine());
                    int[] rates = new int[3];
                    for (int i = 0; i < rates.length; i++) {
                        System.out.print("Enter rate " + (i + 1) + ": ");
                        rates[i] = sc.nextInt();
                    }
                    news.setRates(rates);
                    newsList.add(news);
                    sc.nextLine();
                    break;
                case 2:
                    for(News n : newsList){
                        n.Display();
                    }
                    break;
                case 3:
                        for(News n : newsList){
                            n.Calculate();
                            n.Display();
                        }
                        break;
                case 4:
                            System.exit(0);
                            break;
                            default:
                                break;

            }
        }
    }
}
