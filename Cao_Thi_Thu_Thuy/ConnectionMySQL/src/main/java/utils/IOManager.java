package utils;

import java.io.*;

public class IOManager {
    public String readFile(String filePath) throws Exception {
        if (!FileManager.isFileExists(filePath)) {
            throw new Exception("Error! File Not Exist.");
        }
        String str = "";
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            byte[] bytes = new byte[1024];
            int length = fileInputStream.read(bytes);
            while (length > -1){
                str += new String(bytes, 0, length);
                length = fileInputStream.read(bytes);
            }
        } catch (IOException e) {
            throw new Exception("Error reading the file: " + e.getMessage());
        }

        return str.toString();
    }
    public void writeFile(String filePath, boolean isContinuing, String content) throws Exception {
        if (!FileManager.isFileExists(filePath)) {
            throw new Exception("Error! File Not Exist.");
        }
        String str = "";
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath, isContinuing)) {
            byte[] bytes = content.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.flush();
        } catch (IOException e) {
            throw new Exception("Error writing the file: " + e.getMessage());
        }
    }
    public void writeObject(Object object, String path, String fileName) throws Exception {
        if (object == null) {
            throw new Exception("Error! Object is Null.");
        }
        File folder = new File(path);
        File file = new File(folder, fileName);
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(object);
            objectOutputStream.flush();
        } catch (IOException e) {
            throw new Exception("Error writing object: " + e.getMessage());
        }
    }
    public void readObject(String filePath) throws Exception {
        if (!FileManager.isFileExists(filePath)) {
            throw new Exception("Error! File Not Exist.");
        }
        try (FileInputStream fileInputStream = new FileInputStream(filePath);
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            System.out.println(objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new Exception("Error reading object: " + e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
