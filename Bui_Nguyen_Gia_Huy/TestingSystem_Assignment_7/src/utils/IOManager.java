package utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;


public class IOManager {
    private static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
    private static final String OBJECT_NULL = "Error! Object is Null.";

    // Question 1
    public static String readFile(String pathFile) throws Exception {
        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        return new String(Files.readAllBytes(Paths.get(pathFile)));
    }

    // Question 2
    public static void writeFile(String pathFile, String content, boolean isContinuing) throws Exception {
        if (!FileManager.isFileExists(pathFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        try (FileWriter writer = new FileWriter(pathFile, isContinuing)) {
            writer.write(content);
        }
    }

    // Question 3
    public static void writeObject(Object object, String path, String fileName) throws Exception {
        if (object == null) {
            throw new Exception(OBJECT_NULL);
        }

        // Create folder if it doesn't exist
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }

        String filePath = path + File.separator + fileName;

        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            oos.writeObject(object);
        }
    }

    // Question 4
    public static Object readObject(String filePath) throws Exception {
        if (!FileManager.isFileExists(filePath)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        try (FileInputStream fis = new FileInputStream(filePath);
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            return ois.readObject();
        }
    }
}
