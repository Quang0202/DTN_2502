//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10;
//        if(a > 10 && a <20){
//            System.out.println("a nằm giưa 10 và 20");
//        }
//            else if (a < 5) {
//            System.out.println("a is less than 5");
//        }
//        else {
//            System.out.println("");
//        }
//        System.out.println("Out of if");
//
//        a = 1;
//
//        switch (a) {
//            case 1:
//                System.out.println("a is 1");
//                break;
//            case 2:
//                System.out.println("a is 2");
//                break;
//            case 3:
//                System.out.println("a is 3");
//                break;
//            default:
//        }

//        String s;
//        if (a > 5) {
//            s = "a is greater than 5";
//        }
//        else {
//            s = "a is less than 5";
//        }

        String s = (a > 5) ? "a is greater than 5" : "a is less than 5";
        System.out.println(s);

        int[] arr = {1,10,3,11,5};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                System.out.println(arr[i]);
            }
        }

        for(int num : arr) {
            System.out.println(num);
        }

        // int step = 0;
//        while (step < 10) {
//            System.out.println(step);
//            step++;
//        }

        int step = 0;
        do {
            System.out.println(step);
            step++;
        } while (step < 10);
    }

}