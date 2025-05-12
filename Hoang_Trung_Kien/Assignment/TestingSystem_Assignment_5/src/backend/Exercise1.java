package backend;

import model1.News;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise1 {
    public void MyNews(ArrayList<News> news) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert news \n" +
                            "View list news \n" +
                            "Average rate \n" +
                            "Exit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                News newNews = new News();
                news.add(newNews);
                System.out.println("Nhap title: ");
                scanner.next();
                String s = scanner.nextLine();
                newNews.setTitle(s);
                System.out.println("Nhap publish date: ");
                String p = scanner.nextLine();
                newNews.setTitle(p);
                System.out.println("Nhap author: ");
                String a = scanner.nextLine();
                newNews.setTitle(a);
                System.out.println("Nhap content: ");
                String c = scanner.nextLine();
                newNews.setTitle(c);
                newNews.Calculate();
                return;
            case 2:
                for (News each : news) {
                    each.Display();
                }
                return;
            case 3:
                for (News each : news) {
                    each.Calculate();
                    each.Display();
                }
                return;
            default:
                break;
        }
    }
}
