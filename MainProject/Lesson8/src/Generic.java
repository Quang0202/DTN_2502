import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Generic {
//    public static <T> void print(T a){
//        System.out.println(a);
//    }
//
//    public static void print(Student<? super Integer> student){
//
//    }

    public static <T extends Number> Double sum(T a, T b){
        Double x = (Double) a;
        Double y = (Double) b;
        return x+y;
    }

    public static void print(List<? extends Number> list){
        for(Number number: list){
            System.out.println(number);
        }
    }

    public static void addList(List<? super Integer> list){
        list.add(1);
    }

    public static void main(String[] args) {
        Student<Number> doubleStudent = new Student<>("nguyen van a",1.5);
        Student<Integer> integerStudent = new Student<>("nguyen van a",1);
        Student<String> stringStudent = new Student<>("nguyen van a","");
        System.out.println(doubleStudent);
        List<Integer> list1 = new ArrayList<>();
        List<Double> list2 = new ArrayList<>();
        print(list1);
        print(list2);
        addList(list1);
        Integer result = sum(1,2).intValue();
        System.out.println(result);

    }
}
