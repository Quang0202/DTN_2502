public class Exercise3 {

    // Question 1
    public void question1() {
        Integer salary = 5000;
        float floatSalary = salary.floatValue();
        System.out.printf("Salary (float): %.2f\n", floatSalary);
    }

    // Question 2
    public void question2() {
        String s = "1234567";
        int number = Integer.parseInt(s);
        System.out.println("Parsed int: " + number);
    }

    // Question 3
    public void question3() {
        Integer number = Integer.valueOf("1234567");
        int primitiveInt = number.intValue();
        System.out.println("Converted int: " + primitiveInt);
    }
}
