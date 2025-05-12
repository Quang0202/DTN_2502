import java.text.NumberFormat;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double num = 1200000000;
        Locale locale = new Locale("vi", "VN");
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.FRANCE);
        NumberFormat numberFormat1 = NumberFormat.getCurrencyInstance(Locale.US); // tien te
        System.out.println(numberFormat1.format(num));

        Shape shape = new Shape("hinh tron");
        Shape.Coordinate coordinate = new Shape.Coordinate(1, 2);
    }
}