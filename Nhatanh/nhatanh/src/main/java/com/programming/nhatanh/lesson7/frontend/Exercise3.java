package com.programming.nhatanh.lesson7.frontend;

import com.programming.nhatanh.lesson7.utils.FileManager;

public class Exercise3 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        System.out.println(fileManager.isFileExists("C:\\Users\\pc\\Desktop\\Test.txt"));
    }
}
