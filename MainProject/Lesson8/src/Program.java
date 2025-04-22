import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.*;

public class Program {
    public static <Z> void print (Z a){

    }
    public static void main(String[] args) {
//        Stack<String> strings = new Stack<>();
//        strings.push("nguyen van a");
//        strings.push("nguyen van b");
//        strings.push("nguyen van c");
//        strings.push("nguyen van d");
//        System.out.println(strings.size());
//        System.out.println(strings.pop());
//        System.out.println(strings.size());
//        System.out.println(strings.peek());
//        System.out.println(strings.size());
//
//        for(String str : strings){
//            System.out.println(str);
//        }
//        System.out.println(strings.get(1));
//
//        Queue<String> queue = new LinkedList<>();
//
//        queue.add("nguyen van x");
//        queue.add("nguyen van y");
//        queue.add("nguyen van z");

//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        for(String str: queue){
//            System.out.println(str);
//        }
//        Queue<String> temp = new LinkedList<>();
//        while(!queue.isEmpty()){
//            String str = queue.poll();
//            System.out.println(str);
//            temp.add(str);
//        }
//        while (!temp.isEmpty()){
//            queue.add(temp.poll());
//        }
//
//        for(String str: queue){
//            System.out.println(str);
//        }


        Set<String> sets = new HashSet<>();
        sets.add("nguyen van a");
        sets.add("nguyen van b");
        sets.add("nguyen van c");
        sets.add("nguyen van d");
//        for(String s: sets){
//            System.out.println(s);
//        }
//        Comparator<String> comparator = new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                 return o2.compareTo(o1);
//            }
//        };
//        Set<String> stringSet = new TreeSet<>(comparator);// log(n)
//        stringSet.add("nguyen van z");
//        stringSet.add("nguyen van b");
//        stringSet.add("nguyen van x");
//        stringSet.add("nguyen van d");
//        for(String s: stringSet){
//            System.out.println(s);
//        }

        Map<String, String> map = new TreeMap<>();
        map.put("a","nguyen van a");
        map.put("b","nguyen van b");
        map.put("c","nguyen van c");

        System.out.println(map.get("d"));
        Set<String> keys = map.keySet();
        for(String s:keys){
            System.out.println(s+" "+map.get(s));
        }



    }
}
