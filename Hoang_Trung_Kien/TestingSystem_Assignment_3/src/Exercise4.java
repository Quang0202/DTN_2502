import java.util.Scanner;

public class Exercise4 {
    Scanner scanner = new Scanner(System.in);
    public void ques1() {
        System.out.println("Nhap chuoi:");
        String str = scanner.nextLine();
        String[] strs = str.split("\\s+");
        int i = 0;
        for (String s : strs) {
            if (s != "")
                i ++;
        }
        System.out.println("Chuoi vua nhap co " + i + " tu");
    }

    public void ques2() {
        System.out.println("Nhap chuoi thu 1: ");
        String s1 = scanner.nextLine();
        System.out.println("Nhap chuoi thu 2: ");
        String s2 = scanner.nextLine();
        System.out.println(s1.concat(s2));
    }

    public void ques3() {
        Exercise4 e = new Exercise4();
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
//        System.out.println(name.substring(0, 1).toUpperCase() + name.substring(1));
        String[] strs = name.split("\\s+");
        for (String s : strs) {
            System.out.print(e.toUpperFirstLetter(s) + " ");
        }
    }

    public void ques4() {
        System.out.println("Nhap ten cua ban: ");
        String name = scanner.nextLine();
        for (int i = 0; i < name.length(); i++) {
            String c = name.charAt(i) + "";
            if (c.matches("[a-z]") || c.matches("[A-Z]")) {
                System.out.println((c.toUpperCase()));
            }
        }
    }

    public String toUpperFirstLetter(String s) {
        return s.substring(0, 1).toUpperCase() + s.substring(1);
    }

    public void ques5() {
        System.out.println("Nhap ho:");
        String ho = scanner.nextLine();
        System.out.println("Nhap ten:");
        String ten = scanner.nextLine();
        System.out.println("Ho va ten: " + ho.concat(" ").concat(ten).replaceAll("\\s+", " "));
    }

    public void ques6() {
        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();
        String[] strs = name.split("\\s+");
        System.out.println("Ho la: " + strs[0]);
        String temp = "";
        for (int i = 1; i < name.length() - 1; i++) {
            temp += strs[i];
        }
        System.out.println("Ten dem la: " + temp);
        System.out.println("Ten la: " + strs[strs.length-1]);
    }

    public void ques7() {
        System.out.println("Nhap ho va ten: ");
        String name = scanner.nextLine();
        name = name.trim();
        String[] strs = name.split("\\s+");
        int i = strs.length;
        for (String s : strs) {
            System.out.print(s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());
            if (i > 1)
                System.out.print(" ");
            i--;
        }
    }

    public void ques8(Group[] groups) {
        for (Group group : groups) {
            if (group.groupName.matches(".*Java.*")) {
                System.out.println(group);
            }
            if (group.groupName.contains("Java")) {
                System.out.println(group);
            }
        }
    }

    public void ques9(Group[] groups) {
        for (Group group : groups) {
            if (group.groupName.equals("Java")) {
                System.out.println(group);
            }
        }
    }

    public void ques10(String s1, String s2) {
        if (s1.length() != s2.length()) {
            System.out.println("KO");
        } else {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(s2.length() - i - 1)) {
                    System.out.println("KO");
                    return;
                }
                if (i == s1.length() - 1 && s1.charAt(i) == s2.charAt(0))
                    System.out.println("OK");
            }
        }
    }

    public void ques11(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count ++;
            }
        }
        System.out.println("a xuat hien " + count + " lan");
        s = s.replaceAll("[^a]", "");
        System.out.println(s.length());
    }

    public void ques12(String s) {
        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse += s.charAt(s.length() - i - 1);
        }
        System.out.println(reverse);
    }

    public void ques13(String s) {
        System.out.println(!s.matches(".*[0-9].*"));
        System.out.println(!s.matches(".*\\d.*"));
    }

    public void ques14(String s) {
        System.out.println(s.replaceAll("e", "*"));
    }

    public void ques15(String s) {
        String[] strings = s.split("\\s+");
        String temp = "";
        boolean check = true;
        for (String str : strings) {
            if (str.isEmpty()) continue;
            if (check) {
                temp = str + temp;
                check = false;
            } else {
                temp = str + " " + temp;
            }
        }
        System.out.println(temp);
    }

    public void ques16(String s, int n) {
        if (s.length() % n != 0) {
            System.out.println("KO");
        } else {
            for (int i = 0; i < s.length(); i+=n) {
                System.out.println(s.substring(i, i+n));
            }
        }
    }
}
