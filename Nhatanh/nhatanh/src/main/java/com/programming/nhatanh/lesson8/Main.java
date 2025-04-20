package com.programming.nhatanh.lesson8;

import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args)  {

        Queue<String> newQueue = new LinkedList<>();
        newQueue.add("ABC1");
        newQueue.add("ABC2");
        newQueue.add("ABC3");
        newQueue.add("ABC4");
        newQueue.offer("ABC5");
        System.out.println(newQueue.poll());
        System.out.println(newQueue.peek());

    }

}
