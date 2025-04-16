package com.programming.nhatanh.lesson7.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FileManager {

    public boolean isFileExists(String pathFile){
        File file = new File(pathFile);
        return file.exists();
    }

    public void createNewFile(String path, String fileName) throws IOException {

        String pathFile = path + "\\fileName";

        if(isFileExists(pathFile)){
            throw new RuntimeException("Error! File Exist.");
        } else {
            File file = new File(pathFile);
            if(file.createNewFile()){
                System.out.println("Create successfully");
            } else {
                System.out.println("Create fail");
            }


        }
    }

    public void createNewFile(String pathFile) throws IOException {
        if(isFileExists(pathFile)){
            throw new RuntimeException("Error! File Exist.");
        } else {
            File file = new File(pathFile);
            if(file.createNewFile()){
                System.out.println("Create successfully");
            } else {
                System.out.println("Create fail");
            }
        }
    }

    public void deleteFile(String pathFile){
        File file = new File(pathFile);
        if(file.delete()){
            System.out.println("Delete successfully");
        } else {
            System.out.println("Delete fail");
        }
    }

    public boolean isFolder(String path){
        File file = new File(path);
        return file.isDirectory();
    }

    public List<String> getAllFileName(String path){
        if(!isFolder(path)){
            throw new RuntimeException("Error! Path is not folder");
        } else {
            File file = new File(path);
            return List.of(file.list());
        }
    }

    void copyFile(String sourceFile, String destinationPath, String newName) throws IOException {
        if(!isFileExists(sourceFile)){
            throw new RuntimeException("Error! Source File Not Exist");
        } else if (isFileExists(destinationPath)){
            throw new RuntimeException("Error! newPath has File same name.");
        } else {
            Files.copy(Path.of(sourceFile), Path.of(destinationPath));
            renameFile(destinationPath, newName);
        }
    }


    public void copyFile(String sourceFile, String newPath) throws IOException {
        if(!isFileExists(sourceFile)){
            throw new RuntimeException("Error! Source File Not Exist");
        } else if (isFileExists(newPath)){
            throw new RuntimeException("Error! newPath has File same name.");
        } else {
            Files.copy(Path.of(sourceFile), Path.of(newPath));
        }
    }


    public void moveFile(String sourceFile, String destinationPath) throws IOException {
        if(!isFileExists(sourceFile)){
            throw new RuntimeException("Error! Source File Not Exist");
        }
        Files.move(Path.of(sourceFile), Path.of(destinationPath));
        deleteFile(sourceFile);
    }

    public void renameFile(String pathFile, String newName){
        File file = new File(pathFile);
        File newFile = new File(newName);
        if(isFileExists(pathFile)){
            throw new RuntimeException("Error! File Not Exist");
        } else if(isFileExists(newName)){
            throw new RuntimeException("Error! Name Exist");
        }

        if (file.renameTo(newFile)) {
            System.out.println("File renamed successfully");
        } else {
            System.out.println("Failed to rename file");
        }
    }

    public void createNewFolder(String newPathFolder) throws IOException {
        if(isFolder(newPathFolder)){
            throw new RuntimeException("Error! Folder Exist");
        } else {
            if (new File(newPathFolder).mkdirs()) {
                System.out.println("Folder created successfully");
            } else {
                System.out.println("Failed to create folder");
            }

        }
    }

}
