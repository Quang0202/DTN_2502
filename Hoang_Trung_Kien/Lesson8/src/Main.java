import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack<String> strs = new Stack<>();

        strs.push("gongzhu");
        strs.add("waifu"); // ke thua tu List
        strs.push("scsf");
        strs.pop();
        System.out.println(strs);
        System.out.println(strs.peek());

        for (String s : strs) {
            System.out.println(s);
        }

        System.out.println(strs.get(1));

        Queue<String> queue = new LinkedList<>();

        queue.add("nva");
        queue.add("nvb");
        queue.offer("nvc");
        queue.poll(); // tuong tu pop
        
    }
}