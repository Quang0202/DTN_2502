package vti.be.assignmentday10.ex2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class q1 {
    public static void main(String[] args) throws ParseException {
        @SuppressWarnings("deprecation")
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        Date currentDate = formatter.parse("18/05/2020");
        String date = formatter.format(currentDate);
        System.out.println("Current Date: " + date);
    }
}
