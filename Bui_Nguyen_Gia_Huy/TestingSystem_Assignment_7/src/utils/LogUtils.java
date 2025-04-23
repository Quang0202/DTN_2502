package utils;

import entity.MyException;

import java.time.LocalDateTime;

public class LogUtils {
    public static void writeLog(String message, String reason, StackTraceElement[] stackTrace, LocalDateTime time) {
        try {
            MyException exception = new MyException(message, reason, stackTrace);
            IOManager.writeObject(exception, "C:\\TestFile\\Logs", "Exception.ser");
            System.out.println("Exception logged successfully");
        } catch (Exception e) {
            System.out.println("Failed to log exception: " + e.getMessage());
        }
    }

    public static void writeLog(MyException exception) {
        try {
            IOManager.writeObject(exception, "C:\\TestFile\\Logs", "Exception.ser");
            System.out.println("Exception logged successfully");
        } catch (Exception e) {
            System.out.println("Failed to log exception: " + e.getMessage());
        }
    }

    public static void readExceptionFromFile() {
        try {
            MyException exception = (MyException) IOManager.readObject("C:\\TestFile\\Logs\\Exception.ser");
            System.out.println("Exception details:");
            System.out.println("Message: " + exception.getMessage());
            System.out.println("Reason: " + exception.getReason());
            System.out.println("Time: " + exception.getTime());
        } catch (Exception e) {
            System.out.println("Failed to read exception: " + e.getMessage());
        }
    }
}
