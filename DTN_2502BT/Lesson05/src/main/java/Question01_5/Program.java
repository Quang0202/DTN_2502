package Question01_5;

public class Program {
    public static void main(String[] args) {
        News nes = new News();
        nes.setTitle("a");
        nes.setID(1);
        nes.setAuthor("a");
        nes.setContent("a");
        nes.setPublishDate("a");

        nes.Calculate();
        nes.Display();
    }
}
