package com.programming.nhatanh.lesson7.utils;

import java.io.*;

public class IOManager {
    FileManager fileManager = new FileManager();

    public String readFile(String pathFile) throws IOException {
        if (!fileManager.isFileExists(pathFile)) {
            throw new RuntimeException("Error! File Not Exist.");
        }
        byte[] b = new byte[1024];
        FileInputStream in = new FileInputStream(pathFile);
        int length = in.read(b);
        StringBuilder output = new StringBuilder();
        while (length > -1) {
            String content = new String(b, 0, length);
            output.append(content);
            length = in.read(b);
        }
        in.close();
        return output.toString();
    }

    public void writeFile(String pathFile, boolean isContinuing, String content) throws Exception {
        if (!fileManager.isFileExists(pathFile)) {
            throw new Exception("Error! File Not Exist.");
        }
        FileOutputStream out = new FileOutputStream(pathFile, isContinuing);
        out.write(content.getBytes());
        out.close();
        System.out.println("WRITE_FILE_SUCCESS");
    }

    public void writeObject(Object object, String path, String fileName) throws Exception {
        File folder = new File(path);
        if (!fileManager.isFolder(path)) {
            folder.mkdir();
        }
        var pathFile = path + "\\" + fileName;
        FileOutputStream out = new FileOutputStream(path, false);
        ObjectOutputStream objectOut = new ObjectOutputStream(out);
        objectOut.writeObject(object);
        out.close();
        objectOut.close();
        System.out.println("WRITE_FILE_SUCCESS");
    }

    public Object readObject(String filePath) throws Exception {
        if (!fileManager.isFileExists(filePath)) {
            throw new Exception("Error! File Not Exist.");
        }
        FileInputStream in = null;
        ObjectInputStream objectIn = null;
        try {
            in = new FileInputStream(filePath);
            objectIn = new ObjectInputStream(in);
            System.out.println("READ_FILE_SUCCESS");
            return objectIn.readObject();
        } finally {
            in.close();
            objectIn.close();
        }
    }

}
