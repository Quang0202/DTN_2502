import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Program {
    public static <Z> void print (Z a){

    }
    public static void main(String[] args) {
        Stack<String> strings = new Stack<>();
        strings.push("nguyen van a");
        strings.push("nguyen van b");
        strings.push("nguyen van c");
        strings.push("nguyen van d");
        System.out.println(strings.size());
        System.out.println(strings.pop());
        System.out.println(strings.size());
        System.out.println(strings.peek());
        System.out.println(strings.size());

        for(String str : strings){
            System.out.println(str);
        }
        System.out.println(strings.get(1));

        Queue<String> queue = new LinkedList<>();

        queue.add("nguyen van x");
        queue.add("nguyen van y");
        queue.add("nguyen van z");

//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        for(String str: queue){
//            System.out.println(str);
//        }
        Queue<String> temp = new LinkedList<>();
        while(!queue.isEmpty()){
            String str = queue.poll();
            System.out.println(str);
            temp.add(str);
        }
        while (!temp.isEmpty()){
            queue.add(temp.poll());
        }

        for(String str: queue){
            System.out.println(str);
        }
    }
}
