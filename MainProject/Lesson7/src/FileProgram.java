import java.io.File;
import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class FileProgram {
    public static void main(String[] args) {
        File file = new File("/Users/doquang/Documents");
//        if(!file.exists()){
//            try {
//                file.createNewFile();
//                System.out.println("Create success!");
//            } catch (IOException e) {
//                System.out.println("Create file error");
//            }
////            file.mkdir();
//        }else {
//            file.delete();
//            System.out.println("delete success!");
//        }

        if(file.isFile()){
            System.out.println("Is file");
        }

//        String [] fileName = file.list();
//        for(String name : fileName){
//            System.out.println(name);
//        }

        File [] files = file.listFiles();
        for(File f : files){
            if(f.isFile()) {
                System.out.println(f.getName());
            }
        }


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
        Path path1 = Path.of("/Users/doquang/Documents/test2.txt");
        Path path2 = Path.of("/Users/doquang/Documents/JavaCore/test2.txt");

        try {
            Files.move(path1, path2, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("move success!");
        } catch (IOException e) {
            System.out.println("move error!");
        }


    }
}
