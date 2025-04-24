package Exercise1;

import java.util.ArrayList;
import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<News> newsList = new ArrayList<>();
        while (true) {
            System.out.println("1. Insert news");
            System.out.println("2. View list news");
            System.out.println("3. Average rate");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    News news = new News();
                    System.out.print("Enter title: ");
                    news.setTitle(scanner.nextLine());
                    System.out.print("Enter publish date: ");
                    news.setPublishDate(scanner.nextLine());
                    System.out.print("Enter author: ");
                    news.setAuthor(scanner.nextLine());
                    System.out.print("Enter content: ");
                    news.setContent(scanner.nextLine());

                    int[] rates = new int[3];
                    for (int i = 0; i < 3; i++) {
                        System.out.print("Enter rate " + (i + 1) + ": ");
                        rates[i] = scanner.nextInt();
                    }
                    news.setRates(rates);
                    newsList.add(news);
                    break;

                case 2:
                    for (News n : newsList) {
                        n.Display();
                    }
                    break;

                case 3:
                    for (News n : newsList) {
                        n.Calculate();
                        n.Display();
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    return;

                default:
                    System.out.println("Invalid choice, try again.");
            }
        }
    }
}
