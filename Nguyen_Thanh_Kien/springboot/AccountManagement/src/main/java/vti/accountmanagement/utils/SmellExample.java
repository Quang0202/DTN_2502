package vti.accountmanagement.utils;

public class SmellExample {

    public void printSomething() {
        int unused = 1234; // biến không dùng đến - code smell (Dead store)
        System.out.println("This is hardcoded!"); // hardcoded string
    }
}

