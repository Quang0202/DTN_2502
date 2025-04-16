package vti.utils;
import java.nio.file.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.nio.channels.FileChannel;

public class filemanager {
    public static void main(String[] args) throws Exception {
        // Q1
//        System.out.println(isFileExists("D:\\Data\\test.txt"));
//        createFile("D:\\Data\\test.txt");
//        deleteFile("D:\\Data\\test.txt");
//        boolean q5 = isFolder("D:\\Data");
//        System.out.println( q5 ? "Folder" : "File");
//        getallfile("D:\\Data");
//          copyfile("D:\\Data\\test.txt", "D:\\Data\\test\\test.txt");
//        System.out.println(moveFile("D:\\\\Data\\\\test.txt", "D:\\\\Data\\\\test\\\\test.txt")) ;
//        renamefile("D:\\\\Data\\\\test\\\\test.txt", "D:\\\\Data\\\\test\\\\test1.txt");
        createfolder("D:\\Data\\test01");


    }
    // Q1
    public static boolean isFileExists(String pathFile)  {
        File file = new File(pathFile);
        return file.exists();
    };
    //Q2
    public static void createFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (file.exists()) {
            throw new Exception("Error! File Exist");
        } else {
            file.createNewFile();
            System.out.println("File created");
        }
    }
    public static void deleteFile(String pathFile) throws Exception {
        File file = new File(pathFile);
        if (!file.exists()) {
            throw new Exception("Error! File Not Exist");
        } else {
            file.delete()	;
            System.out.println("File Deleted");
        }
    }

    // Question05

    public static boolean isFolder(String path){
        File file = new File(path);
        if(file.isDirectory()){
            return true;
        } else {
            return false;
        }
    }

    // Question06
    public static boolean getallfile(String path) throws Exception {
        File file = new File(path);
        if(file.isDirectory()){
            System.out.println(Arrays.toString(file.list()));
            return true;
        } else {
            throw new Exception("Error! Path is not folder");
        }
    }

    public static void copyfile(String pathsrc, String pathdest) throws IOException {
        long start = System.nanoTime();

        File source = new File(pathsrc);
        File dest = new File(pathdest);
        //copy files using java.nio FileChannel
        source = new File(pathsrc);
        dest = new File(pathdest);
        start = System.nanoTime();
        copyFileUsingChannel(source, dest);
        System.out.println("Time taken by Channel Copy = "+(System.nanoTime()-start));
    }

    private static void copyFileUsingChannel(File source, File dest) throws IOException, IOException {
        FileChannel sourceChannel = null;
        FileChannel destChannel = null;
        try {
            sourceChannel = new FileInputStream(source).getChannel();
            destChannel = new FileOutputStream(dest).getChannel();
            destChannel.transferFrom(sourceChannel, 0, sourceChannel.size());
        }finally{
            sourceChannel.close();
            destChannel.close();
        }
    }

    public static boolean moveFile(String sourcePath, String targetPath) {
        boolean fileMoved = true;
        try {
            Files.move(Paths.get(sourcePath), Paths.get(targetPath), StandardCopyOption.REPLACE_EXISTING);
        } catch (Exception e) {
            fileMoved = false;
            e.printStackTrace();
        }
        return fileMoved;
    }


    public static void renamefile(String oldname, String newname) throws IOException {
        File file = new File(oldname);
        File file2 = new File(newname);
        if (file2.exists())
            throw new java.io.IOException("file exists");
        boolean success = file.renameTo(file2);
        if(success){
            System.out.println("File renamed successfully");
        } else {
            System.out.println("File rename failed");
        }
    }

    public static void createfolder(String foldername)  {
        File folder = new File(foldername);
        if(!folder.exists()){
            folder.mkdir();
            System.out.println("Folder created");
        }
    }





}
