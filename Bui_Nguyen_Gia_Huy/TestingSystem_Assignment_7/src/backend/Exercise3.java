package backend;

import utils.FileManager;

public class Exercise3 {
    public void question1() {
        String path = "/home/jake/TestFile/test.txt";
        boolean exists = FileManager.isFileExists(path);
        System.out.println("File exists: " + exists);
    }

    public void question2() {
        try {
            FileManager.createNewFile("/home/jake/TestFile/newfile.txt");
            System.out.println("File created successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question4() {
        try {
            FileManager.deleteFile("/home/jake/TestFile/fileToDelete.txt");
            System.out.println("File deleted successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question5() {
        String path = "/home/jake/TestFile/";
        boolean isFolder = FileManager.isFolder(path);
        System.out.println("Is folder: " + isFolder);
    }

    public void question6() {
        try {
            System.out.println("Files in folder:");
            for (String fileName : FileManager.getAllFileName("/home/jake/TestFile/")) {
                System.out.println(fileName);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question7() {
        try {
            FileManager.copyFile("/home/jake/TestFile/source.txt", "C:\\TestFile\\Destination", "copied_file.txt");
            System.out.println("File copied successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question8() {
        try {
            FileManager.moveFile("/home/jake/TestFile/fileToMove.txt", "C:\\TestFile\\Destination");
            System.out.println("File moved successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question9() {
        try {
            FileManager.renameFile("/home/jake/TestFile/oldName.txt", "newName.txt");
            System.out.println("File renamed successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question10() {
        try {
            FileManager.createNewFolder("/home/jake/TestFile/NewFolder");
            System.out.println("Folder created successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question11() {
        try {
            FileManager.downloadFile("https://example.com/sample.jpg", "/home/jake/TestFile/Downloads");
            System.out.println("File downloaded successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
