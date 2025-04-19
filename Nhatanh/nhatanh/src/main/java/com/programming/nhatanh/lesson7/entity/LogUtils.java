package com.programming.nhatanh.lesson7.entity;

import com.programming.nhatanh.lesson7.exception.MyException;
import com.programming.nhatanh.lesson7.utils.IOManager;
import java.time.LocalDateTime;

public class LogUtils {
    private final String PATH_LOG = "src\\document";
    private final String NAME_LOG = "log.txt";
    IOManager ioManager = new IOManager();
    public void writeLog(MyException myException) throws Exception {
        ioManager.writeObject(myException, PATH_LOG, NAME_LOG);
    }

    public void readLog() throws Exception {
        System.out.println(ioManager.readObject(PATH_LOG + "\\" + NAME_LOG));
    }
}
