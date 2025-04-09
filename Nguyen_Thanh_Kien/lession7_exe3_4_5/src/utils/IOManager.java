package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class IOManager {
    private static final String rootPath = System.getProperty("user.dir") + "//";
    private static final String ERROR_OCCURRED = "An error occurred.";
    private static final String FILE_NOT_EXIST = "File Not Exist.";
    private static final String OBJECT_IS_NULL = "Object is Null.";

    public static String readFile(String pathFile) {
        if (!FileManager.isFileExist(pathFile)) {
            throw new RuntimeException(FILE_NOT_EXIST);
        }
        ;
        File myObj = new File(FileManager.formatPath(pathFile));
        String data = "";
        try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                data += myReader.nextLine() + "\n";
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(ERROR_OCCURRED);
        }
        return data.trim();
    }

    public static void writeFile(String pathFile, Boolean isContinuing, String content) {
        if (!FileManager.isFileExist(FileManager.formatPath(pathFile))) {
            FileManager.createNewFile(FileManager.formatPath(pathFile));
        }
        FileWriter myWriter = null;
        try {
            myWriter = new FileWriter(FileManager.formatPath(pathFile), isContinuing);
            myWriter.write(content);
            myWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void writeObject(Object object, String path, String fileName) {
        if (object == null) {
            throw new RuntimeException(OBJECT_IS_NULL);
        }
        if (!FileManager.isFolder(path)) {
            FileManager.createNewFolder(path);
        }
        try {
            FileOutputStream fo = new FileOutputStream(FileManager.formatPath(path + "//" + fileName));
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(object);
            fo.close();
            oos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static Object readObject(String filePath) {
        if (!FileManager.isFileExist(filePath)) {
            throw new RuntimeException(FILE_NOT_EXIST);
        }
        try {
            FileInputStream fo = new FileInputStream(FileManager.formatPath(filePath));
            ObjectInputStream ois = new ObjectInputStream(fo);
            return ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
