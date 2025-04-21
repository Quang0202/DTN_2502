package Program;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Filepr {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\DTN_2502BT\\Testing_System_Assignment_4_Debug/test");
        if (!file.exists()) {
//            try {
//                file.createNewFile();
//                System.out.println("createNewFile");
//            } catch (IOException e) {
//                System.out.println("create  file ero");
//            }
//            System.out.println("file đã tồn tại");
            file.mkdir(); // tạo 1 file new
        } else {
            file.delete(); // xóa file

        }
        if (file.isDirectory()) {
            System.out.println("true  : folder");
        } else {
            System.out.println("false  : folder");
        }


        // in ra toàn bộ có trong file name đấy
        String[] files = file.list();
        for(String str : files) {
            System.out.println(str);
        }
        // lenh
        File [] files2 = file.listFiles();
        for(File f : files2) {
            if(f.isFile()) {
                System.out.println(f.getName());
            }
        }

        //Rename file
        File soure = new File("D:\\DTN_2502BT\\Testing_System_Assignment_4_Debug/test.txt");
        File target = new File("D:\\DTN_2502BT\\Testing_System_Assignment_4_Debug/test2.txt");

        soure.renameTo(target);

        //copy sang file khác
        Path path = Paths.get("D:\\DTN_2502BT\\test2.txt");
        Path target2 = Paths.get("D:\\DTN_2502\\test2.txt");
Files.move(path,target2);
    }
}
