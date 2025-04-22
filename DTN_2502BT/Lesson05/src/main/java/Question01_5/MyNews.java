package Question01_5;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        News s = new News();
        int choice ;

        while (true) {

            System.out.println("Vui lòng chọn các mục sau");
            System.out.println("1.Insert news");
            System.out.println("2.View list news");
            System.out.println("3.Average rate");
            System.out.println("4.exit");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Insert new news  Thanh cong: ");
                    System.out.println("Vui long nhap title");
                    s.setTitle(sc.nextLine());
                    System.out.println("Vui long nhap PublishDate");
                    s.setPublishDate(sc.nextLine());
                    System.out.println("Vui long nhap content");
                    s.setContent(sc.nextLine());

                    int[] rate = new int[3];
                    System.out.println("Vui long nhap rate");
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Đánh giá" + (i+1) + ":");
                        rate[i] = sc.nextInt();
                    }
                    s.setRates(rate);
                    sc.nextLine();
                    System.out.println("---------------------------------------------");
                    break;

                case 2:
                    s.Display();
                    System.out.println("---------------------------------------------");
                    break;
                case 3:
                    s.Calculate();
                    s.Display();
                    System.out.println("---------------------------------------------");
                    break;
                case 4:
                    System.out.println("Thank you for using our program");
                    sc.close();
                    return;
                default:
                    System.out.println("Vui lòng chọn lại từ 1 đến 4.");

            }
        }

    }
}
