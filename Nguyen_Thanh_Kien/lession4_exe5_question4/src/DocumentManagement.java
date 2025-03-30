import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class DocumentManagement {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Magazine> magazines = new ArrayList<>();
    static ArrayList<Newspaper> newspapers = new ArrayList<>();

    public static void start() {
        Book book = new Book();
        book.setAuthor("kien");
        book.setCode("B");
        book.setNumberOfPages(100);
        book.setTotalNumberOfPublications(10);
        book.setImprint("Viet Nam");
        books.add(book);

        book = new Book();
        book.setAuthor("minh");
        book.setCode("A");
        book.setNumberOfPages(100);
        book.setTotalNumberOfPublications(10);
        book.setImprint("Viet Nam");
        books.add(book);

        Magazine magazine = new Magazine();
        magazine.setCode("M");
        magazine.setImprint("USA");
        magazine.setMonthOfPublications(10);
        magazine.setNumberOfPublications(2);
        magazine.setTotalNumberOfPublications(20);
        magazines.add(magazine);

        Newspaper newspaper = new Newspaper();
        newspaper.setCode("N");
        newspaper.setImprint("Italy");
        newspaper.setTotalNumberOfPublications(10);
        newspaper.setDayOfPublication(1);
        newspapers.add(newspaper);

        mainMenu();
    }

    private static void addDocument() {
        childMenu();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        Document document = add();
        switch (choice) {
            case 1:
                Book book = (Book) document;
                System.out.println("Nhập tên tác giả:\n");
                book.setAuthor(sc.nextLine());
                System.out.println("Nhập số trang:\n");
                book.setNumberOfPages(sc.nextInt());
                books.add(book);
                sc.nextLine();
                break;
            case 2:
                Magazine magazine = (Magazine) document;
                System.out.println("Nhập số phát hành:\n");
                magazine.setNumberOfPublications(sc.nextInt());
                sc.nextLine();
                System.out.println("Nhập tháng phát hành:\n");
                magazine.setMonthOfPublications(sc.nextInt());
                magazines.add(magazine);
                sc.nextLine();
                break;
            case 3:
                Newspaper newspaper = (Newspaper) document;
                System.out.println("Nhập ngày phát hành:\n");
                newspaper.setDayOfPublication(sc.nextInt());
                newspapers.add(newspaper);
                sc.nextLine();
                break;
        }
        System.out.println("Thêm thành công!!! Enter to continue...");
        sc.nextLine();
        mainMenu();
    }

    private static Document add() {
        Document document = new Book();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập mã tài liệu:");
        document.setCode(sc.nextLine());
        System.out.println("Nhập tên nhà xuất bản:");
        document.setImprint(sc.nextLine());
        System.out.println("Nhập số bản phát hành:");
        document.setTotalNumberOfPublications(sc.nextInt());
        return document;
    }

    private static void deleteDocumentByCode() {
        childMenu();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập mã muốn xoá:");
        String code = sc.nextLine();
        switch (choice) {
            case 1:
                books = (ArrayList<Book>) books.stream()
                        .filter(e -> !e.getCode().equals(code)).collect(Collectors.toList());
                break;
            case 2:
                magazines = (ArrayList<Magazine>) magazines.stream()
                        .filter(e -> !e.getCode().equals(code)).collect(Collectors.toList());
                break;
            case 3:
                newspapers = (ArrayList<Newspaper>) newspapers.stream()
                        .filter(e -> !e.getCode().equals(code)).collect(Collectors.toList());
                break;
        }
        System.out.println("Xoá thành công!!! Enter to continue...");
        sc.nextLine();
        mainMenu();
    }

    private static void displayInfo() {
        childMenu();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                System.out.println(books.toString());
                break;
            case 2:
                System.out.println(magazines.toString());
                break;
            case 3:
                System.out.println(newspapers.toString());
                break;
        }
        System.out.println("Enter to continue...");
        sc.nextLine();
        mainMenu();
    }

    private static void searchDocumentByCode() {
        childMenu();
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập mã sách muốn tìm kiếm:");
        String code = sc.nextLine().toLowerCase();
        switch (choice) {
            case 1:
                books.stream().filter(e -> e.getCode().toLowerCase().contains(code))
                        .forEach(System.out::println);
                break;
            case 2:
                magazines.stream().filter(e -> e.getCode().toLowerCase().contains(code))
                        .forEach(System.out::println);
                break;
            case 3:
                newspapers.stream().filter(e -> e.getCode().toLowerCase().contains(code))
                        .forEach(System.out::println);
                break;
        }
        System.out.println("Enter to continue...");
        sc.nextLine();
        mainMenu();
    }

    private static void mainMenu() {
        System.out.println("Chọn chức năng: ");
        System.out.println("1.Thêm mới tài liệu.\n" +
                "2.Xoá tài liệu theo mã tài liêu.\n" +
                "3.Hiển thị thông tin về tài liệu.\n" +
                "4.Tìm kiếm tài liệu.\n" +
                "5.Thoát chương trình.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        switch (choice) {
            case 1:
                addDocument();
                break;
            case 2:
                deleteDocumentByCode();
                break;
            case 3:
                displayInfo();
                break;
            case 4:
                searchDocumentByCode();
                break;
            default:
                System.exit(0);
        }
    }

    private static void childMenu() {
        System.out.println("Chọn loại tài liệu: ");
        System.out.println("1.Sách\n" +
                "2.Tạp chí\n" +
                "3.Báo");
    }
}
