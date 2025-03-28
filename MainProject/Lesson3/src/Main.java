//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        long b = a;
//        float c = a;

//        long l = Integer.MAX_VALUE +1000;
//        float f = 10.988f;
//        int in = (int) f;
        int a = 10;
        int b = 3;
        float fa = 10f;
        float fb = 3f;
        float c = (float)a / b;
        System.out.println(c);

        int[] arr = {1,2,3,4,5};
        String[] arr2 = new String[5];

        for(String i : arr2){
            System.out.println(i);
        }

        Integer num1 = a;
        Integer num2 = 10;
        Float f = 10.3f;
        Character vChar ='a';
        int result = Integer.parseInt("11111");
        float result2 = Float.parseFloat("1111.222");
        String str = 100 +"";// "100":
        int num3 = num1;
        double num4 = num1.doubleValue();
        System.out.println(num3);
        String str1 = "nguyen van a";
        String str2 = new String("nguyen van a");

        if(str1.equals("nguyen van a")){
            System.out.println("bằng nhau");
        }else {
            System.out.println("0 bằng nhau");
        }

        if(str2.equals("nguyen van a")){
            System.out.println("bằng nhau");
        }else {
            System.out.println("0 bằng nhau");
        }

    }
}