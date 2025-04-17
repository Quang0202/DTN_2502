package com.company.frontend.TestingSystem7;

import com.company.entity.Department;
import com.company.utils.IOManager;

public class Program4 {
    public static void main(String[] args) {
        IOManager ioManager = new IOManager();
        try {
//            // Q1.
//            System.out.println(ioManager.readFile("D:/baitap.txt"));
//            // Q2.
//            ioManager.writeFile("D:/baitap.txt", true, " Thu Thuy");
//            System.out.println(ioManager.readFile("D:/baitap.txt"));
            // Q3.
            Department department = new Department(1, "Dev");
            ioManager.writeObject((Object) department, "D:/", "object.ser");
            ioManager.readObject("D:/object.ser");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
