package Exercise2.Q4;

public class MainMyMath {
    public static void main(String[] args) {
        MyMath mm = new MyMath();

        System.out.println("Tổng int: " + mm.sum(5, 7));
        System.out.println("Tổng byte: " + mm.sum((byte)3, (byte)4));
        System.out.println("Tổng float: " + mm.sum(3.5f, 2.5f));
    }
}