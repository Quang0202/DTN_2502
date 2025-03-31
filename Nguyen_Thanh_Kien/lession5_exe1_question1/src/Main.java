import model.News;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    private static ArrayList<News> newsList = new ArrayList<News>();

    public static void main(String[] args) {
        mainMenu();
    }

    private static void insert() {
        Scanner sc = new Scanner(System.in);
        News news = new News();
        System.out.println("Enter title: ");
        news.setTitle(sc.nextLine());
        System.out.println("Enter publish date (dd-mm-yyyy): ");
        news.setPublishDate(sc.nextLine());
        System.out.println("Enter author: ");
        news.setAuthor(sc.nextLine());
        System.out.println("Enter content: ");
        news.setContent(sc.nextLine());
        int[] ratesTemp = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter rate " + (i + 1));
            ratesTemp[i] = sc.nextInt();
            sc.nextLine();
        }
        news.setRates(ratesTemp);
        newsList.add(news);
        System.out.println("Added !!! Enter to continue...");
        sc.nextLine();
        mainMenu();
    }

    private static void view() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < newsList.size(); i++) {
            System.out.println("News " + (i + 1) + "----------------------------------------------------------------");
            newsList.get(i).display();
        }
        System.out.println("Enter to continue...");
        sc.nextLine();
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("1.Insert news.\n" +
                "2.View list news.\n" +
                "3.Exit\n");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                insert();
                break;
            case 2:
                view();
                break;
            default:
                System.exit(0);
        }
    }
}