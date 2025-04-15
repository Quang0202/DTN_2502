package utils;

import java.time.LocalDateTime;

public class LogUtils {
    private static final String PATH_LOG = "src\\document";
    private static final String NAME_LOG = "log.txt";

    public static void writeLog(MyException myException) {
        IOManager.writeObject(myException, PATH_LOG, NAME_LOG);
    }

    public static void readLog(){
        System.out.println(IOManager.readObject(PATH_LOG + "\\" + NAME_LOG));
    }
}
