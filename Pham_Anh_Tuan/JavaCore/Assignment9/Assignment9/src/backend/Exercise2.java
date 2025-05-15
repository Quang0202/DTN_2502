package backend;
import java.util.Date;

@SuppressWarnings("deprecation")
public class Exercise2 {
    public void question1() {
        Date date = new Date(120, 4, 18); // Deprecated constructor
        System.out.println("Deprecated Date created: " + date);
    }
}
