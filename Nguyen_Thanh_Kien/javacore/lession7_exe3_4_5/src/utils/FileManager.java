package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.*;

public class FileManager {
//    private static final String rootPath = System.getProperty("user.dir") + "\\";


    public static Boolean isFileExist(String filename) {
        checkDirExists(formatPath(filename.substring(0, filename.lastIndexOf("\\"))));
        return new File(formatPath(filename)).exists();
    }

    public static void createNewFile(String filename) {
        if(isFileExist(filename)){
            throw new RuntimeException("File already exists!");
        }
        File file = new File(formatPath(filename));
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
        checkDirExists(formatPath(filename));
        File file = new File(filename);
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            throw new IOException("File not exists");
        }
    }

    public static Boolean isFolder(String path) {
        File file = new File(formatPath(path));
        if (file.exists()) {
            return !file.isFile();
        }
        throw new RuntimeException("Path" + path + " is not exists !!!");
    }

    public static List<String> getAllFileName(String path) {
        List<String> list = new ArrayList<String>();
        path = formatPath(path);
        if (isFolder(path)) {
            File[] files = new File(path).listFiles();
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
        checkDirExists(formatPath(distinationPath));
        checkDirExists(formatPath(sourceFile));

        File oldSourceFile = new File(formatPath(sourceFile));
        File newSourcefile = new File(formatPath(distinationPath) + "\\" + formatPath(newName));
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
        checkDirExists(formatPath(newPath));
        checkDirExists(formatPath(sourceFile));

        File oldSourceFile = new File(formatPath(sourceFile));
        File newSourcefile = new File(formatPath(newPath));
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

    public static String formatPath(String path) {

        return stream(path.split("\\\\"))
                .filter(e -> !e.contains("\\") && !e.isEmpty())
                .collect(Collectors.joining("\\"));
    }

    private static void checkDirExists(String path) {
        if (!new File(formatPath(path)).exists()) {
            throw new RuntimeException("Path: " + path + " is not exists !!!");
        }
    }

    public static void moveFile(String sourceFile, String destinationPath) {
        destinationPath = formatPath(destinationPath);
        checkDirExists(destinationPath.substring(0, destinationPath.lastIndexOf("\\")));
        if (!isFolder(formatPath(sourceFile))) {
            Path sourceDir = Paths.get(formatPath(sourceFile));
            Path targetDir = Paths.get(destinationPath);
            try {
                Files.move(sourceDir, targetDir, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void renameFile(String pathFile, String newName) {
        pathFile = formatPath(pathFile);
        checkDirExists(pathFile);
        File file = new File(pathFile);
        File file2 = new File(pathFile.substring(0, pathFile.lastIndexOf("\\")) + "\\" + newName);
        if (!file.renameTo(file2)) {
            System.out.println("Cannot rename");
        } else {
            System.out.println("Rename Successfully");
        }
    }

    public static void createNewFolder(String newPathFolder) {
        checkDirExists(newPathFolder.substring(0, newPathFolder.lastIndexOf("\\")));
        File theDir = new File(formatPath(newPathFolder));
        if (!theDir.exists()) {
            if (theDir.mkdirs()) {
                System.out.println("Folder created");
            } else {
                System.out.println("Folder not created");
            }
        } else {
            throw new RuntimeException("Folder name already exists !!!");
        }
    }

    public static void downloadFile(String fileLink, String folder) throws IOException {
        checkDirExists(folder.substring(0, folder.lastIndexOf("\\")));
        File theDir = new File(formatPath(folder));
        if (!theDir.exists()) {
            createNewFolder(formatPath(folder));
        }
        String[] s = fileLink.split("/");
        String name = s[s.length - 1];
        String pathFolder = formatPath(folder) + "\\" + name;
        File file = new File(pathFolder);
        if (file.exists()) {
            pathFolder = getNameFileDuplicate(folder, removeExtension(name), name.substring(name.lastIndexOf(".")));
        }
        URL url = new URL(fileLink);
        URLConnection connection = url.openConnection();
        int size = connection.getContentLength();
        InputStream in = connection.getInputStream();
        FileOutputStream out = new FileOutputStream(pathFolder);
        int byteDownloaded = 0;
        byte[] b = new byte[1024];
        int length = in.read(b);
        while (length != -1) {
            byteDownloaded += length;
            System.out.println(String.format("%.2f", byteDownloaded * 100f / size) + "%");
            out.write(b, 0, length);
            length = in.read(b);
        }
        out.close();
        in.close();
        System.out.println("Download successfully");
    }

    private static Boolean checkNameFileValid(String fileName, String nameNotExtension) {
        fileName = fileName.substring(nameNotExtension.length());
        if (fileName.isEmpty()) {
            return true;
        } else if (fileName.length() > 3 && fileName.startsWith(" (") && fileName.endsWith(")")) {
            try {
                Integer.parseInt(fileName.substring(2, fileName.lastIndexOf(")")));
                return true;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return false;
    }

    private static String removeExtension(String fileName) {
        if (fileName.contains(".")) {
            return fileName.substring(0, fileName.lastIndexOf("."));
        }
        return fileName;
    }

    private static Integer getNumberOfFileByFileName(String fileName) {
        if (!fileName.contains("(")) {
            return 0;
        }
        fileName = fileName.substring(fileName.lastIndexOf("(") + 1, fileName.length() - 1);
        return Integer.parseInt(fileName);
    }

    private static String getNameFileDuplicate(String folder, String nameNotExtension, String typeExtension) {
        String pathFolder = "";
        //            Lấy ra toàn bô file trong folder
        List<String> listFile = getAllFileName(folder);
//        duyệt for để lây ra những tên có phần mở rộng và tên tương ứng
//        Ví dụ danh sách có a (1).txt, a (3).txt, a.txt, b(1).txt tên cần tìm là a
//        sẽ trả về danh sách có a (1), a(3), a. Xóa phần mở rộng và tên không hợp lệ khỏi danh sách
        for (int i = 0; i < listFile.size(); i++) {
//                Lấy ra tên file không chứa phần mở rộng
            String tempName = removeExtension(listFile.get(i));
//                Kiểm tra nếu tên file bắt đầu bằng tên file được lấy từ url và có chứa .
            if (tempName.startsWith(nameNotExtension) && listFile.get(i).contains(".")) {
//                  Lấy ra kiểu mở rộng của tên file trong danh sách file
                String tempTypeExtension = listFile.get(i).substring(listFile.get(i).lastIndexOf("."));
//              DK1:  Nếu tên file bằng tên được lấy từ url và phần mở rộng file bằng phần mở rộng của url
//              DK2:  Nếu tên file có chứa kí tự ( ) và số nằm trong đó, và phần mở rộng file bằng phần mở rộng của url
                if ((tempName.equals(nameNotExtension) || checkNameFileValid(tempName, nameNotExtension))
                        && tempTypeExtension.equals(typeExtension)) {
//              list có tên a.txt,a (1).txt, b.txt ở đây sẽ xử lý lấy ra a.txt và a (1).txt sau đó remove name ko hợp lệ
                    listFile.set(i, tempName);
                } else {
                    // remove những name không thoả mãn sau đó gán lại i để tránh sót dữ liệu
                    listFile.remove(i);
                    i--;
                }
            } else {
//                    remove những name không bắt đầu bằng tên lấy từ url và không chứa phần mở rộng
//                    sau đó gán lại i để tránh sót dữ liệu
                listFile.remove(i);
                i--;
            }
        }

        if (!listFile.isEmpty()) {
//                check truờng hợp list có đúng 1 tên mà tên đó bằng hoặc không bằng với tên lấy từ url
            if (listFile.size() == 1) {
                if (listFile.get(0).equals(nameNotExtension)) {
//                        nếu bằng thì thêm (2) vào tên file
                    pathFolder = formatPath(folder) + "\\" + nameNotExtension + " (2)" + typeExtension;
                } else {
//                        nếu không bằng thì set bằng tên lấy từ url
                    pathFolder = formatPath(folder) + "\\" + nameNotExtension + typeExtension;
                }
            } else {
                listFile.sort(new Comparator<String>() {
                    @Override
                    public int compare(String o1, String o2) {
                        return getNumberOfFileByFileName(o1) - getNumberOfFileByFileName(o2);
                    }
                });
                boolean check = false;
                if (!listFile.get(0).equals(nameNotExtension)) {
                    pathFolder = formatPath(folder) + "\\" + nameNotExtension + typeExtension;
                } else {
                    for (int i = 1; i < listFile.size(); i++) {
//                        lấy ra số của tên file a (2) sẽ trả về 2, sau đó kiểm tra để gán số hợp lệ
//                        kiểm tra trong trường hợp có 1 file bị xóa mất chuỗi liên tục ví dụ đã có
//                        a (1) a (3) thì gán tên tiếp theo là a (2)
                        if (getNumberOfFileByFileName(listFile.get(i)) != (i + 1)) {
                            pathFolder = formatPath(folder) + "\\" + nameNotExtension + " (" + (i + 1) + ")" + typeExtension;
                            check = true;
                            break;
                        }
                    }
//                    trường hợp không bị mất chuỗi liên tục thì set tên cộng thêm số độ dài danh sách + 1
                    if (!check) {
                        pathFolder = formatPath(folder) + "\\" + nameNotExtension + " (" + (listFile.size() + 1) + ")" + typeExtension;
                    }
                }
            }
        }
        return pathFolder;
    }
}
