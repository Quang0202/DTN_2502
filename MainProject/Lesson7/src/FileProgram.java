import java.io.*;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FileProgram {
    public static void main(String[] args) {
        File file = new File("/Users/doquang/Documents/Test/test.ser");
        try {
            file.createNewFile();
        } catch (IOException e) {

        }
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//                System.out.println("Create success!");
//            } catch (IOException e) {
//                System.out.println("Create file error");
//            }
//           file.mkdir();
//        }else {
//            file.delete();
//            System.out.println("delete success!");
//        }

//        if(file.isFile()){
//            System.out.println("Is file");
//        }

//        String [] fileName = file.list();
//        for(String name : fileName){
//            System.out.println(name);
//        }
//
//        File [] files = file.listFiles();
//        for(File f : files){
//            if(f.isFile()) {
//                System.out.println(f.getName());
//            }
//        }


        //Rename file
//        File source = new File("/Users/doquang/Documents/test.txt");
//        File target = new File("/Users/doquang/Documents/test2.txt");
//
//        if(source.renameTo(target)){
//            System.out.println("rename success!");
//        }else {
//            System.out.println("error");
//        }
        //Move file
//        Path path1 = Path.of("/Users/doquang/Documents/test2.txt");
//        Path path2 = Path.of("/Users/doquang/Documents/JavaCore/test2.txt");
//
//        try {
//            Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING);
//            System.out.println("move success!");
//        } catch (IOException e) {
//            System.out.println("move error!");
//        }

//        Read data from file
//        FileInputStream fileInputStream = new FileInputStream("/Users/doquang/Documents/Test/test.txt");
//
//        byte[] bytes = new byte[4];
//
//        int length = fileInputStream.read(bytes);
//        String result= "";
//        while(length > -1){
//            String str = new String(bytes,0,length);
//            result+=str;
//            length = fileInputStream.read(bytes);
//        }
//        System.out.println(result);
//        try(FileOutputStream fileOutputStream = new FileOutputStream("/Users/doquang/Documents/Test/test.txt",true);
//        ) {
//            String outStr = "Nguyen van a";
//            byte[] outBytes = outStr.getBytes();
//            fileOutputStream.write(outBytes);
//            System.out.println("Write success");
//        } catch (IOException e){
//
//        }

//         Read object

//        Department department = new Department(1, "sale");
//        Department department2 = new Department(2, "marketing");
//        Department department3 = new Department(3, "CEO");
//        List<Department> departments = Arrays.asList(department3,department2,department);
//
//        try(FileOutputStream fileOutputStream = new FileOutputStream("/Users/doquang/Documents/Test/test.ser");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)
//        ) {
//            objectOutputStream.writeObject(departments);
//            System.out.println("Write list department success");
//
//        } catch (Exception e) {
//            System.out.println("error");
//        }

        try (FileInputStream fileInputStream = new FileInputStream("/Users/doquang/Documents/Test/test.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)
        ) {

//            Department department = (Department) objectInputStream.readObject();
//            System.out.println(department);
            List<Department> departments = (List<Department>) objectInputStream.readObject();
            for(Department department : departments){
                System.out.println(department);
            }

        } catch (Exception e) {
            System.out.println("error");
        }

    }
}
