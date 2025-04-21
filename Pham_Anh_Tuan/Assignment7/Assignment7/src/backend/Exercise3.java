package backend;

import entity.FileManager;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;


public class Exercise3 {

    public void createNewFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (file.exists()) {
            throw new Exception("File already exists.");
        }

        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully: " + pathFile);
            } else {
                System.out.println("File creation failed.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void createNewFile(String path, String fileName) throws Exception {
        if (!path.endsWith(File.separator)) {
            path += File.separator;
        }
        String fullPath = path + fileName;
        createNewFile(fullPath);
    }

    public void question1(){
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the full path of the file to check: ");
        String path = scanner.nextLine();

        if (fileManager.isFileExists(path)) {
            System.out.println("The file exists!");
        } else {
            System.out.println(FileManager.ERROR_FILE_NOT_FOUND);
        }

        scanner.close();
    }

    public void question2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter full path : ");
        String fullPath = scanner.nextLine();

        try {
            createNewFile(fullPath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter folder path: ");
        String folder = scanner.nextLine();

        System.out.print("Enter file name: ");
        String fileName = scanner.nextLine();

        try {
            createNewFile(folder, fileName);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question4() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter full path of file to delete: ");
        String path = scanner.nextLine();

        try {
            fileManager.deleteFile(path);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question5() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter the path to check (File or Folder): ");
        String path = scanner.nextLine();

        if (fileManager.isFolder(path)) {
            System.out.println("This is a folder.");
        } else {
            System.out.println("This is a file.");
        }

        scanner.close();
    }

    public void question6() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter folder path to list files: ");
        String path = scanner.nextLine();

        try {
            List<String> fileNames = fileManager.getAllFileName(path);
            System.out.println("Files in folder:");
            for (String name : fileNames) {
                System.out.println(name);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question7() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter source file path: ");
        String sourceFile = scanner.nextLine();

        System.out.print("Enter destination folder: ");
        String destination = scanner.nextLine();

        System.out.print("Enter new file name (leave empty to keep same name): ");
        String newName = scanner.nextLine();

        try {
            if (newName.isEmpty()) {
                fileManager.copyFile(sourceFile, destination);
            } else {
                fileManager.copyFile(sourceFile, destination, newName);
            }
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question8() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter source file path: ");
        String source = scanner.nextLine();

        System.out.print("Enter destination folder: ");
        String destination = scanner.nextLine();

        try {
            fileManager.moveFile(source, destination);
            System.out.println("File moved successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question9() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter file path to rename: ");
        String path = scanner.nextLine();

        System.out.print("Enter new file name: ");
        String newName = scanner.nextLine();

        try {
            fileManager.renameFile(path, newName);
            System.out.println("File renamed successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question10() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter new folder path to create: ");
        String path = scanner.nextLine();

        try {
            fileManager.createNewFolder(path);
            System.out.println("Folder created successfully.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void question11() {
        Scanner scanner = new Scanner(System.in);
        FileManager fileManager = new FileManager();

        System.out.print("Enter file URL to download: ");
        String link = scanner.nextLine();

        System.out.print("Enter destination folder: ");
        String folder = scanner.nextLine();

        try {
            fileManager.downloadFile(link, folder);
            System.out.println("Download complete.");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

}
