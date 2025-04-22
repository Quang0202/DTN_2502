package BackEnd;

public class Q3 {
    public static void main(String[] args) {
//        int result = Math.max(5,7);
//        System.out.println(result);
        Q3 obj = new Q3();

        System.out.println(obj.Sum(7,5));
         obj.Min(7,5);
         obj.Max(7,5);
    }

    public int Sum(int a, int b ) {
        return a + b;
    }
    public int Min(int a,int b ) {
        if (a < b) {
            System.out.println("min la "  + a);
            return a;
        } else {
            System.out.println("min la "  + b);
            return b;
        }
    }
public int Max(int a,int b ) {
    if (a > b) {
        System.out.println("Max la "  + a);
        return a;
    } else {
        System.out.println("Max la "  + b);
        return b;
    }
}
}
