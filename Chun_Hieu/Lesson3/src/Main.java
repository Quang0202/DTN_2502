//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        int a = 10;
//        long b = a;
//        float c = b;

//        long l = 100;
//        float f = 10.188f;
//        int in = (int) f;

        int a = 10;
        int b = 3;
        float fa = 10;
        float fb = 3;
        float c = (float)a/b;
        System.out.println(fa/fb);

        int[] arr = {1,2,3,4,5};
        String[] arr2 = new String[5];
        for (String i : arr2){
            System.out.println(i);
        }

        Integer num = 123;
        Float num2 = 123.45f;
        Character ch = 'a';
        int result = Integer.parseInt("111111");
        float result2 = Float.parseFloat("1111.223");
        
        int num3 = num;
        double num4 = num2;
        System.out.println(num3);
        String str1 = "Nguyen van a";
        String str2 = new String("Nguyen van a");
         if(str1 == str2){
             System.out.println("str1 == str2");
         }else {
             System.out.println("str1 != str2");
         }

         Department d = new Department();



    }
}