
public class Main {
    public static void main(String[] args) {
        int a = 7;
        if(a > 5 && a < 20){
            System.out.println("a is between 5 and 20");
        }
        else if (a<10){
            System.out.println("a is less than 5");
        }
        else{
            System.out.println("a is greater than 20");
        }
        System.out.println("out of if");
        a=5;
        switch (a){
            case 1:
                System.out.println("a is 1");
                 break;
            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("a is not 1, 2 or 3");
        }

//        String s;
//        if(a> 5){
//            s = "a is greater than 5";
//        }
//        else {
//            s = "a is less than 5";
//        }
        String s = (a > 5) ? "a is greater than 5" : "a is less than 5";

        System.out.println( (a > 5) ? "a is greater than 5" : "a is less than 5");
        int [] arr = {1,14,3,11,5};
//        for(int i=0; i<arr.length; i++){
//            if(arr[i] % 2 != 0) {
//                System.out.println(arr[i]);
//            }
//        }
//        String[] names = {"John", "Jane", "Jill", "Joe"};
//        for(int num : arr){// num = 1, num = 14
//            System.out.println(num);
//        }
//        for(String name : names){
//            System.out.println(name);
//        }

//        int step = 10;
//        while(step < 10){
//            System.out.println(step);
//            step++;
//        }
//        int step = 10;
//        do{
//            System.out.println(step);
//            step++;
//        } while (step<10);
//        for (int i = 0; i < 10; i++) {
//            if(i==5){
//                break;
//            }
//            System.out.println(i);
//        }
        for (int i = 0; i < 10; i++) {
            if(i==5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("end of for");

    }
}