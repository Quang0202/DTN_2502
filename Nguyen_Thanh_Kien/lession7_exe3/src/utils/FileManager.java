package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileManager {
    private static final String rootPath = System.getProperty("user.dir");


    public static Boolean isFileExist(String filename) {
        checkDirExists(rootPath + "\\" + filename);
        return new File(rootPath + "\\" + formatPath(filename)).exists();
    }

    public static void createNewFile(String filename) {
        checkDirExists(rootPath + "\\" + filename);
        File file = new File(rootPath + "\\" + formatPath(filename));
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

    public static void createNewFile(String path, String fileName) {
        checkDirExists(formatPath(path) + "\\" + formatPath(fileName));
        File file = new File(formatPath(path) + "\\" + formatPath(fileName));
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
        checkDirExists(rootPath + "\\" + formatPath(filename));
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

    public static void copyFile(String sourceFile, String distinationPath, String newName) {
        checkDirExists(rootPath + "\\" + formatPath(distinationPath));
        checkDirExists(rootPath + "\\" + formatPath(sourceFile));

        File oldSourceFile = new File(rootPath + formatPath(sourceFile));
        File newSourcefile = new File(rootPath + formatPath(distinationPath) + "\\" + formatPath(newName));
        if (!oldSourceFile.exists()) {
            throw new RuntimeException("Source file not exists !!!");
        }
        if (newSourcefile.exists()) {
            throw new RuntimeException("New path has File same name. !!!");
        }
        try {
            Files.copy(oldSourceFile.toPath(), newSourcefile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void copyFile(String sourceFile, String newPath) {
        checkDirExists(rootPath + "\\" + formatPath(newPath));
        checkDirExists(rootPath + "\\" + formatPath(sourceFile));

        File oldSourceFile = new File(rootPath + formatPath(sourceFile));
        File newSourcefile = new File(rootPath + formatPath(newPath));
        if (!oldSourceFile.exists()) {
            throw new RuntimeException("Source file not exists !!!");
        }
        if (newSourcefile.exists()) {
            throw new RuntimeException("New path has File same name. !!!");
        }
        try {
            Files.copy(oldSourceFile.toPath(), newSourcefile.toPath());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String formatPath(String path) {
        return Arrays.stream(path.split("\\\\"))
                .filter(e -> !e.equals("\\"))
                .collect(Collectors.joining("\\"));
    }

    private static void checkDirExists(String path) {
        if (!new File(path).exists()) {
            throw new RuntimeException("Path: " + path + " is not exists !!!");
        }
    }

    public static void moveFile(String sourceFile, String destinationPath) {
        destinationPath = formatPath(destinationPath);
        checkDirExists(rootPath + destinationPath.substring(0, destinationPath.lastIndexOf("\\")));
        if (!isFolder(formatPath(sourceFile))) {
            Path sourceDir = Paths.get(rootPath + formatPath(sourceFile));
            Path targetDir = Paths.get(rootPath + destinationPath);
            try {
                Files.move(sourceDir, targetDir, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void renameFile(String pathFile, String newName) {
        pathFile = formatPath(pathFile);
        checkDirExists(rootPath + pathFile);
        File file = new File(rootPath + pathFile);
        File file2 = new File(rootPath + pathFile.substring(0, pathFile.lastIndexOf("\\")) + "\\" + newName);
        if(!file.renameTo(file2)){
            System.out.println("Cannot rename");
        } else {
            System.out.println("Rename Successfully");
        }
    }
}
