import java.util.*;

public class Exercise4 {

    // Question 1
    public void question1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().trim();
        String[] words = input.split("\\s+");
        System.out.println("Number of words: " + words.length);
    }

    // Question 2
    public void question2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string s2: ");
        String s2 = scanner.nextLine();
        System.out.println("Concatenated: " + s1 + s2);
    }

    // Question 3
    public void question3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        String capitalized = name.substring(0, 1).toUpperCase() + name.substring(1);
        System.out.println("Capitalized: " + capitalized);
    }

    // Question 4
    public void question4() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            System.out.println("Character " + (i + 1) + ": " + name.charAt(i));
        }
    }

    // Question 5
    public void question5() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your last name: ");
        String last = scanner.nextLine();
        System.out.print("Enter your first name: ");
        String first = scanner.nextLine();
        System.out.println("Full name: " + last + " " + first);
    }

    // Question 6
    public void question6() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim();
        String[] parts = fullName.split("\\s+");
        System.out.println("Last name: " + parts[0]);
        System.out.println("Middle name: " + String.join(" ", Arrays.copyOfRange(parts, 1, parts.length - 1)));
        System.out.println("First name: " + parts[parts.length - 1]);
    }

    // Question 7
    public void question7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your full name: ");
        String fullName = scanner.nextLine().trim().replaceAll("\\s+", " ");
        String[] words = fullName.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)))
                    .append(word.substring(1).toLowerCase())
                    .append(" ");
        }
        System.out.println("Formatted: " + result.toString().trim());
    }

    // Question 8
    public void question8(String[] groups) {
        for (String group : groups) {
            if (group.contains("Java")) {
                System.out.println(group);
            }
        }
    }

    // Question 9
    public void question9(String[] groups) {
        for (String group : groups) {
            if (group.equals("Java")) {
                System.out.println(group);
            }
        }
    }

    // Question 10
    public void question10() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String s1 = scanner.nextLine();
        System.out.print("Enter string 2: ");
        String s2 = scanner.nextLine();
        if (s1.equals(new StringBuilder(s2).reverse().toString())) {
            System.out.println("OK");
        } else {
            System.out.println("KO");
        }
    }

    // Question 11
    public void question11() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        long count = str.chars().filter(c -> c == 'a').count();
        System.out.println("Number of 'a': " + count);
    }

    // Question 12
    public void question12() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }

    // Question 13
    public void question13() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        boolean containsDigit = str.matches(".*\\d.*");
        System.out.println(!containsDigit);
    }

    // Question 14
    public void question14() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter character to replace: ");
        char from = scanner.nextLine().charAt(0);
        System.out.print("Enter replacement character: ");
        char to = scanner.nextLine().charAt(0);
        System.out.println("Result: " + str.replace(from, to));
    }

    // Question 15
    public void question15() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = scanner.nextLine().trim();
        String[] words = str.split("\\s+");
        for (int i = words.length - 1; i >= 0; i--) {
            System.out.print(words[i] + (i > 0 ? " " : ""));
        }
        System.out.println();
    }

    // Question 16
    public void question16() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        System.out.print("Enter chunk size: ");
        int n = scanner.nextInt();

        if (str.length() % n != 0) {
            System.out.println("KO");
            return;
        }

        for (int i = 0; i < str.length(); i += n) {
            System.out.println(str.substring(i, i + n));
        }
    }
}
