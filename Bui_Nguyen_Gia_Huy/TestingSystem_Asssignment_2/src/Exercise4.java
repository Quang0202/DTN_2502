import java.time.LocalDate;
import java.util.Random;

public class Exercise4 {
    private Random random = new Random();

    // Question 1:
    public void question1() {
        int randomInt = random.nextInt();
        System.out.println("Random integer: " + randomInt);
    }

    // Question 2
    public void question2() {
        double randomDouble = random.nextDouble();
        System.out.println("Random floating-point number: " + randomDouble);
    }

    // Question 3
    public void question3(String[] names) {
        int index = random.nextInt(names.length);
        System.out.println("Random name: " + names[index]);
    }

    // Question 4
    public void question4() {
        LocalDate startDate = LocalDate.of(1995, 7, 24);
        LocalDate endDate = LocalDate.of(1995, 12, 20);
        long daysBetween = startDate.until(endDate).getDays();
        LocalDate randomDate = startDate.plusDays(random.nextInt((int) daysBetween + 1));
        System.out.println("Random date: " + randomDate);
    }

    // Question 5
    public void question5() {
        LocalDate endDate = LocalDate.now();
        LocalDate startDate = endDate.minusYears(1);
        long daysBetween = startDate.until(endDate).getDays();
        LocalDate randomDate = startDate.plusDays(random.nextInt((int) daysBetween + 1));
        System.out.println("Random date within last year: " + randomDate);
    }

    // Question 6
    public void question6() {
        LocalDate endDate = LocalDate.now();
        int daysInPast = random.nextInt(365 * 100); // Random date within the last 100 years
        LocalDate randomDate = endDate.minusDays(daysInPast);
        System.out.println("Random past date: " + randomDate);
    }

    // Question 7
    public void question7() {
        int randomThreeDigitNumber = 100 + random.nextInt(900);
        System.out.println("Random three-digit number: " + randomThreeDigitNumber);
    }
}
