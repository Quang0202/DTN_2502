package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
    private static final String rootPath = System.getProperty("user.dir");


    public static Boolean isFileExist(String filename) {
        return new File(rootPath + "\\" + formatPath(filename)).exists();
    }

    public static void createNewFile(String filename) {
        File file = new File(rootPath + "\\" +formatPath(filename));
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                throw new IOException("File already exists");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void deleteFile(String filename) throws IOException {
        File file = new File(rootPath + filename);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            throw new IOException("File not exists");
        }
    }

    public static Boolean isFolder(String path) {
        File file = new File(rootPath + formatPath(path));
        if (file.exists()) {
            return !file.isFile();
        }
        throw new RuntimeException("Path is not exists !!!");
    }

    public static List<String> getAllFileName(String path) {
        List<String> list = new ArrayList<String>();
        path = formatPath(path);
        if (isFolder(path)) {
            File[] files = new File(rootPath + path).listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isFile()) {
                        list.add(file.getName());
                    }
                }
            }
        } else {
            throw new RuntimeException("Path is not a folder !!!");
        }
        return list;
    }

    public static void copyFile(String sourceFile, String distinationPath, String newName){
        File oldSourceFile = new File(rootPath + formatPath(sourceFile));
        File newSourcefile = new File(rootPath + formatPath(distinationPath) + "\\" + formatPath(newName));
        if(!oldSourceFile.exists()){
            throw new RuntimeException("Source file not exists !!!");
        }
        if(newSourcefile.exists()){
            throw new RuntimeException("New path has File same name. !!!");
        }
        try {
            Files.copy(oldSourceFile.toPath(), newSourcefile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyFile(String sourceFile, String newPath){
        File oldSourceFile = new File(rootPath + formatPath(sourceFile));
        File newSourcefile = new File(rootPath + formatPath(newPath));
        if(!oldSourceFile.exists()){
            throw new RuntimeException("Source file not exists !!!");
        }
        if(newSourcefile.exists()){
            throw new RuntimeException("New path has File same name. !!!");
        }
        try {
            Files.copy(oldSourceFile.toPath(), newSourcefile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String formatPath(String path){
        return Arrays.stream(path.split("\\\\"))
                .filter(e -> !e.equals("\\"))
                .collect(Collectors.joining("\\"));
    }
}
