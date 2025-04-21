package org;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Program {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");
        stack.push("Python");
        stack.push("JavaScript");
        stack.add("World");
        System.out.println(stack.size());
        System.out.println(stack.pop()); // xóa phần tử cuối cùng
        System.out.println(stack.size());
        System.out.println(stack.peek()); // lấy phần tử cuối cùng nhưng ko xóa
        System.out.println(stack.size());

        for (String s : stack) {
            System.out.println(s);
        }
        System.out.println(stack.get(1));


        Queue<String> queue = new LinkedList<>();

        queue.add("Hello queue");
        queue.add("World queue");
        queue.add("Java queue");
queue.offer("Python queue");

        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.peek());

//        int index = 0;
//        for (String s : queue) {
//            System.out.println(s);
//            index++;
//        }
//        System.out.println(queue.getClass());


        //cách 2 : duyệt xong mất hết , còn thêm dòng 48, 51,55-61 thì ko mất
        Queue<String> stack2 = new LinkedList<>() {
        };

        while (!queue.isEmpty()) {
            String s = queue.poll();
            System.out.println(s);
            stack2.add(s);
        }
        while (!stack2.isEmpty()) {
         queue.add(stack2.poll());
        }

        for (String s : stack2) {
            System.out.println(s);
        }
    }
}
