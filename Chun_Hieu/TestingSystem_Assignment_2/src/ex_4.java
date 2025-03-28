import java.time.LocalDate;
import java.util.Locale;
import java.util.Random;

public class ex_4 {
    public static void main(String[] args) {
        Random random = new Random();
        // Question 1
        int randomNum = random.nextInt();
        System.out.println(randomNum);

        // Question 2
        double randomDouble = random.nextDouble();
        System.out.println(randomDouble);

        //Question 3
        String[] students = {"Trang", "Hiếu", "Chun", "Pes", "PicaChun"};
        String randomName = students[random.nextInt(students.length)];
        System.out.println(randomName);

        //Question 4
        int minDay = (int) LocalDate.of(1995, 7, 24).toEpochDay();
        int maxDay = (int) LocalDate.of(1995, 12, 20).toEpochDay();
        long randomInt = minDay + random.nextInt(maxDay - minDay);
        LocalDate randomDate = LocalDate.ofEpochDay(randomInt);
        System.out.println(randomDate);

        //Question 5
//        int quakhu = (int) LocalDate.of(2024, 3, 26).toEpochDay();
//        int hientai = (int) LocalDate.now().toEpochDay();
//        long randomIntt = quakhu + random.nextInt(hientai - quakhu);
//        LocalDate randomDatee = LocalDate.ofEpochDay(randomIntt);
//        System.out.println(randomDatee);

        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.of(now.getYear() - 1, now.getMonthValue(), now.getDayOfMonth() );

    }
}
