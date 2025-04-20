package com.programming.nhatanh.lesson7.utils;

import com.programming.nhatanh.lesson7.entity.MyException;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Arrays;

public class LogUtils {
    public static void writeLog (String message, String reason, String stackTrace, LocalDateTime time) throws Exception {
        IOManager ioManager = new IOManager();
        String content = message + " \n"+ reason +"\n "+ stackTrace + " "+ time +"\n";
        File file = new File("/Users/doquang/Documents/Test/Exception.txt");
        if(!file.exists()){
            file.createNewFile();
        }
        ioManager.writeFile("/Users/doquang/Documents/Test/Exception.txt",true,content);
        System.out.println("WriteLog Success");
    }

    public static void writeLog (MyException myException) throws Exception {
        LogUtils.writeLog(myException.getMessage(), myException.getMessage(), Arrays.toString(myException.getStackTrace()),LocalDateTime.now());
    }

    public static void readLog() throws IOException {
        IOManager ioManager = new IOManager();
        System.out.println(ioManager.readFile("/Users/doquang/Documents/Test/Exception.txt"));
    }

}
