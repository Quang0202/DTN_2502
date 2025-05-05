package utils;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
    public static boolean isFileExists(String pathFile){
        File file = new File(pathFile);
        return file.exists();
    }
    public void createNewFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (file.exists()) {
            throw new Exception("Error! File Exist.");
        }

        boolean created = file.createNewFile();
        if (created) {
            System.out.println("File đã được tạo: " + file.getAbsolutePath());
        } else {
            System.out.println("Không thể tạo file.");
        }
    }
    public void createNewFile(String path, String fileName) throws Exception {
        if (!path.endsWith("\\") && !path.endsWith("/")) {
            path += File.separator;
        }
        createNewFile(path + fileName);
    }
    public void deleteFile(String pathFile) throws Exception {
        File file = new File(pathFile);

        if (!file.exists() || !file.isFile()) {
            throw new Exception("Error! File Not Exist.");
        }

        boolean deleted = file.delete();

        if (deleted) {
            System.out.println("Đã xóa file: " + pathFile);
        } else {
            System.out.println("Không thể xóa file: " + pathFile);
        }
    }
    public boolean isFolder(String path){
        File file = new File(path);
        return file.exists() && (file.isFile() || file.isDirectory());
    }
    public List<String> getAllFileName(String path) throws Exception {
        File folder = new File(path);

        if (!folder.exists() || !folder.isDirectory()) {
            throw new Exception("Error! Path is not folder.");
        }

        File[] files = folder.listFiles();
        List<String> fileNames = new ArrayList<>();

        if (files != null) {
            for (File f : files) {
                if (f.isFile()) {
                    fileNames.add(f.getName());
                }
            }
        }
        return fileNames;
    }
    public void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
        File source = new File(sourceFile);
        if (!source.exists() || !source.isFile()) {
            throw new Exception("Error! Source File Not Exist.");
        }

        // Đảm bảo destination path kết thúc bằng separator
        if (!destinationPath.endsWith("\\") && !destinationPath.endsWith("/")) {
            destinationPath += File.separator;
        }

        File destination = new File(destinationPath + newName);
        if (destination.exists()) {
            throw new Exception("Error! newPath has File same name.");
        }
        Files.copy(source.toPath(), destination.toPath());
        System.out.println("Copy thành công: " + destination.getAbsolutePath());
    }
    public void copyFile(String sourceFile, String newPath) throws Exception {
        File source = new File(sourceFile);
        if (!source.exists() || !source.isFile()) {
            throw new Exception("Error! Source File Not Exist.");
        }
        String fileName = source.getName();
        copyFile(sourceFile, newPath, fileName);
    }
    public void moveFile(String sourceFile, String destinationPath) throws Exception {
        File source = new File(sourceFile);
        System.out.println(source.toPath());
        if (!source.exists() || !source.isFile()) {
            throw new Exception("Error! File Not Exist.");
        }

        File destinationDir = new File(destinationPath);
        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }
        Path newPath = Paths.get(destinationDir.getAbsolutePath(), source.getName());
        if (Files.exists(newPath)) {
            throw new Exception("Error! Name is Exist.");
        }
        Files.move(source.toPath(), newPath);
        System.out.println("Đã di chuyển file tới: " + newPath.toString());
    }
    public void renameFile(String pathFile, String newName) throws Exception {
        File oldFile = new File(pathFile);

        if (!oldFile.exists() || !oldFile.isFile()) {
            throw new Exception("Error! File Not Exist.");
        }
        File parentDir = oldFile.getParentFile();
        File newFile = new File(parentDir, newName);

        if (newFile.exists()) {
            throw new Exception("Error! Name is Exist.");
        }

        boolean success = oldFile.renameTo(newFile);
        if (!success) {
            throw new Exception("Error! Rename failed.");
        }

        System.out.println("Đã đổi tên thành công: " + newFile.getAbsolutePath());
    }
    public void createNewFolder(String newPathFolder) throws Exception {
        File folder = new File(newPathFolder);

        if (folder.exists()) {
            throw new Exception("Error! Folder Exist.");
        }

        boolean created = folder.mkdirs();

        if (!created) {
            throw new Exception("Error! Cannot create folder.");
        }

        System.out.println("Folder created successfully: " + folder.getAbsolutePath());
    }
}
