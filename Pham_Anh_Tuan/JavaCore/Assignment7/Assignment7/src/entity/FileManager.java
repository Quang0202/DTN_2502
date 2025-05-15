package entity;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileManager {

    public static final String ERROR_FILE_NOT_FOUND = "Error: File does not exist.";
    public static final String ERROR_FILE_NOT_EXIST = "Error! File Not Exist.";
    public static final String ERROR_OBJECT_IS_NULL = "Error! Object is Null.";
    public static final String ERROR_FOLDER_NOT_EXIST = "Error! Folder Not Exist.";

    public boolean isFileExists(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }

    public void deleteFile(String pathFile) throws Exception {
        File file = new File(pathFile);

        if (!file.exists()) {
            throw new Exception(ERROR_FILE_NOT_FOUND);
        }

        if (file.delete()) {
            System.out.println("File deleted successfully: " + pathFile);
        } else {
            System.out.println("Failed to delete the file.");
        }
    }

    public void downloadFile(String fileLink, String folder) throws IOException {
        URL url = new URL(fileLink);
        File dir = new File(folder);

        if (!dir.exists()) {
            dir.mkdirs();
        }

        String fileName = Paths.get(url.getPath()).getFileName().toString();
        File outFile = new File(dir, fileName);
        int count = 0;

        while (outFile.exists()) {
            count++;
            String baseName = fileName.contains(".") ?
                    fileName.substring(0, fileName.lastIndexOf('.')) :
                    fileName;
            String extension = fileName.contains(".") ?
                    fileName.substring(fileName.lastIndexOf('.')) :
                    "";
            outFile = new File(dir, baseName + " (" + count + ")" + extension);
        }

        try (InputStream in = url.openStream();
             OutputStream out = new FileOutputStream(outFile)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("Downloaded to: " + outFile.getAbsolutePath());
        }
    }

    public void createNewFolder(String newPathFolder) throws Exception {
        File folder = new File(newPathFolder);
        if (folder.exists()) {
            throw new Exception("Error! Folder Exist.");
        }

        boolean created = folder.mkdirs();
        if (created) {
            System.out.println("Folder created: " + newPathFolder);
        } else {
            System.out.println("Failed to create folder.");
        }
    }

    public void renameFile(String pathFile, String newName) throws Exception {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new Exception("Error! File Not Exist.");
        }

        File newFile = new File(file.getParent(), newName);
        if (newFile.exists()) {
            throw new Exception("Error! Name is Exist.");
        }

        boolean renamed = file.renameTo(newFile);
        if (renamed) {
            System.out.println("Renamed successfully to: " + newName);
        } else {
            System.out.println("Rename failed.");
        }
    }

    public void moveFile(String sourceFile, String destinationPath) throws Exception {
        File source = new File(sourceFile);
        if (!source.exists()) {
            throw new Exception("Error! File Not Exist.");
        }

        File dest = new File(destinationPath, source.getName());
        Files.move(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public void copyFile(String sourceFile, String destinationPath, String newName) throws Exception {
        File source = new File(sourceFile);
        if (!source.exists() || !source.isFile()) {
            throw new Exception("Error! Source File Not Exist.");
        }

        File destFolder = new File(destinationPath);
        if (!destFolder.exists()) {
            destFolder.mkdirs(); // create folders if needed
        }

        File destFile = new File(destFolder, newName);
        if (destFile.exists()) {
            throw new Exception("Error! newPath has File same name.");
        }

        Files.copy(source.toPath(), destFile.toPath());
    }

    public void copyFile(String sourceFile, String newPath) throws Exception {
        File source = new File(sourceFile);
        copyFile(sourceFile, newPath, source.getName());
    }

    public List<String> getAllFileName(String path) throws Exception {
        File folder = new File(path);
        if (!folder.exists() || !folder.isDirectory()) {
            throw new Exception("Error! Path is not folder.");
        }

        String[] fileNames = folder.list();
        return fileNames != null ? Arrays.asList(fileNames) : new ArrayList<>();
    }

    public boolean isFolder(String path) {
        File file = new File(path);
        return file.exists() && file.isDirectory();
    }

    // Method to read file content
    public String readFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content.toString();
    }

    // Method to write content to file
    public void writeFile(String pathFile, String content, boolean isContinuing) throws Exception {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, isContinuing))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to write object to file
    public void writeObject(Object object, String path, String fileName) throws Exception {
        if (object == null) {
            throw new Exception(ERROR_OBJECT_IS_NULL);
        }

        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs(); // Create folder if it doesn't exist
        }

        File file = new File(path + File.separator + fileName);
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file))) {
            objectOutputStream.writeObject(object);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Method to read object from file
    public Object readObject(String filePath) throws Exception {
        File file = new File(filePath);
        if (!file.exists()) {
            throw new Exception(ERROR_FILE_NOT_EXIST);
        }

        Object object = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file))) {
            object = objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

}
