import java.text.DateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        Date date = new Date();
        System.out.println(date);
        Locale l = Locale.FRANCE;
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, l);
        String strDte = df.format(date);
        System.out.println(strDte);

        Date d = new Date();
        System.out.println(date);
        Locale locale = new Locale("vi", "VN");
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String strDate = df1.format(date);
        System.out.println(strDate);

        LocalDateTime localDateTime = LocalDateTime.now();
        Locale loc = new Locale("vi", "VN");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMMM-yyyy", loc);
        System.out.println(localDateTime.format(dateTimeFormatter));
    }
}