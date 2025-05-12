package Exercise3.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {
    public static boolean isFileExists(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }

    public static void createNewFile(String pathFile) throws IOException {
        File file = new File(pathFile);

        if(file.createNewFile()) {
            System.out.println("Tao thanh cong");
        } else {
            System.out.println("File da ton tai");
        }
    }

    public static void createNewFile(String path, String fileName) throws IOException {
        File file = new File(path + File.separator + fileName);

        if(file.createNewFile()) {
            System.out.println("Tao thanh cong");
        } else {
            System.out.println("File da ton tai");
        }
    }

    public static void deleteFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (file.exists()) {
            file.delete();
            System.out.println("Xoa thanh cong");
        } else {
            throw new Exception("Error! File Not Exist.");
        }
    }

    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    public static List<String> getAllFileName(String path) {
        File file = new File(path);
        if (file.isDirectory()) {
            return Arrays.asList(file.list());
        }
        return new ArrayList<>();
    }

    public static void copyFile(String sourceFile, String destinationPath, String newName) throws IOException {
        Path source = Path.of(sourceFile);
        Path destination = Path.of(destinationPath);

        Path file = destination.resolve(newName);

        Files.copy(source, file, StandardCopyOption.REPLACE_EXISTING);
    }

    public static void copyFile(String sourceFile, String destinationPath) throws IOException {
        Path source = Path.of(sourceFile);
        Path destination = Path.of(destinationPath);
        String fileName = source.getFileName().toString();

        Path result = destination.resolve(fileName);

        Files.copy(source, result, StandardCopyOption.REPLACE_EXISTING);
    }
}
