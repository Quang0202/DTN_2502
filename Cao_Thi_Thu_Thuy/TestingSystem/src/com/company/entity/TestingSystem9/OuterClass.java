package com.company.entity.TestingSystem9;

public class OuterClass {
    public void show() {
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }

    public class InnerClass {
        public void show() {
            System.out.println("Đây là inner class");
        }
    }
}
