package utils;

import java.io.*;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;


public class FileManager {
    private static final String FILE_NOT_EXISTS = "Error! File Not Exist.";
    private static final String FILE_EXISTS = "Error! File Exist.";
    private static final String PATH_NOT_FOLDER = "Error! Path is not folder.";
    private static final String NEWPATH_HAS_FILE = "Error! newPath has File same name.";
    private static final String NAME_EXISTS = "Error! Name is Exist.";
    private static final String FOLDER_EXISTS = "Error! Folder Exist.";

    // Question 1
    public static boolean isFileExists(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }

    // Question 2
    public static void createNewFile(String pathFile) throws Exception {
        if (isFileExists(pathFile)) {
            throw new Exception(FILE_EXISTS);
        }

        File file = new File(pathFile);
        file.createNewFile();
    }

    public static void createNewFile(String path, String fileName) throws Exception {
        String pathFile = path + File.separator + fileName;
        createNewFile(pathFile);
    }

    // Question 4
    public static void deleteFile(String pathFile) throws Exception {
        if (!isFileExists(pathFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        File file = new File(pathFile);
        file.delete();
    }

    // Question 5
    public static boolean isFolder(String path) {
        File file = new File(path);
        return file.isDirectory();
    }

    // Question 6
    public static List<String> getAllFileName(String path) throws Exception {
        if (!isFolder(path)) {
            throw new Exception(PATH_NOT_FOLDER);
        }

        File folder = new File(path);
        File[] files = folder.listFiles();
        List<String> fileNames = new ArrayList<>();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileNames.add(file.getName());
                }
            }
        }

        return fileNames;
    }

    // Question 7
    public static void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
        if (!isFileExists(sourceFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        String destinationFile = destinationPath + File.separator + newName;
        if (isFileExists(destinationFile)) {
            throw new Exception(NEWPATH_HAS_FILE);
        }

        Files.copy(Paths.get(sourceFile), Paths.get(destinationFile));
    }

    public static void copyFile(String sourceFile, String newPath) throws Exception {
        File file = new File(sourceFile);
        copyFile(sourceFile, newPath, file.getName());
    }

    // Question 8
    public static void moveFile(String sourceFile, String destinationPath) throws Exception {
        if (!isFileExists(sourceFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        File file = new File(sourceFile);
        String destinationFile = destinationPath + File.separator + file.getName();

        Files.move(Paths.get(sourceFile), Paths.get(destinationFile), StandardCopyOption.REPLACE_EXISTING);
    }

    // Question 9
    public static void renameFile(String pathFile, String newName) throws Exception {
        if (!isFileExists(pathFile)) {
            throw new Exception(FILE_NOT_EXISTS);
        }

        File file = new File(pathFile);
        String directoryPath = file.getParent();
        String newPath = directoryPath + File.separator + newName;

        if (isFileExists(newPath)) {
            throw new Exception(NAME_EXISTS);
        }

        Files.move(Paths.get(pathFile), Paths.get(newPath));
    }

    // Question 10
    public static void createNewFolder(String newPathFolder) throws Exception {
        if (isFileExists(newPathFolder)) {
            throw new Exception(FOLDER_EXISTS);
        }

        File folder = new File(newPathFolder);
        folder.mkdirs();
    }

    // Question 11
    public static void downloadFile(String fileLink, String folder) throws Exception {
        // Create folder if it doesn't exist
        File folderFile = new File(folder);
        if (!folderFile.exists()) {
            folderFile.mkdirs();
        }

        // Get file name from URL
        URL url = new URL(fileLink);
        String fileName = Paths.get(url.getPath()).getFileName().toString();

        // Check if file with same name exists and adjust name if needed
        String finalPath = folder + File.separator + fileName;
        File downloadFile = new File(finalPath);
        int counter = 1;

        while (downloadFile.exists()) {
            String name = fileName.substring(0, fileName.lastIndexOf('.'));
            String extension = fileName.substring(fileName.lastIndexOf('.'));
            finalPath = folder + File.separator + name + "(" + counter + ")" + extension;
            downloadFile = new File(finalPath);
            counter++;
        }

        // Download the file
        try (InputStream in = url.openStream();
             ReadableByteChannel rbc = Channels.newChannel(in);
             FileOutputStream fos = new FileOutputStream(finalPath)) {

            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            System.out.println("File downloaded successfully to: " + finalPath);
        }
    }
}
