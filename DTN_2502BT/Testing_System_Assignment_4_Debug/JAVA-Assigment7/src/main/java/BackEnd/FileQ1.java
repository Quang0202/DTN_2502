package BackEnd;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;

public class FileQ1 {
    public static Boolean ischeck(String pathFile) {
        File file = new File(pathFile);
        return file.exists();
    }
public static void Q2() throws Exception {
     File file = new File("D:\\Photography/Photography.txt");

     if(!file.exists()) {
         throw new Exception("Error! File Exist.");
     }else {

         try {
             if( file.createNewFile() ) {
                 System.out.println("createNewFile");
             }else {
                 System.out.println("Failed to create the file.");
             }

         } catch (IOException e) {
             System.out.println("IOException occurred: " + e.getMessage());
         }
     }
}

public static void Q3() {
        File file = new File("D:\\Photography/Photography.txt");
        if(!file.exists()) {

            try {
                 file.createNewFile() ;
                    System.out.println("createNewFile");

            } catch (IOException e) {
                System.out.println("IOException occurred: " + e.getMessage());
            }
        } else {
            file.delete();
            System.out.println("File deleted.");
        }
}
public static void Q5() {
        File file = new File("D:\\Photography/Photography.txt");
        if(file.isDirectory()) {
            System.out.println("isDirectory");
        } else {
            System.out.println("isFile");
        }
}
public static void Q6() {
        File file = new File("D:\\Photography");
       String [] files = file.list();
       for(String fileName : files) {
           System.out.println(fileName);
       }

}
public static void Q7() {

}
public static void Q8() {

}
public static void Q9() throws Exception {
        //rename file

    File resoure = new File("D:\\Photography/Photography.txt");
    File taget = new File("D:\\Photography/cubo.txt");

   if(resoure.renameTo(taget)) {
       throw new Exception("Error! File Exist.");

   } else {
       System.out.println("File renamed.");
   }
}
    public static void main(String[] args) throws Exception {
//        String path = "C:\\Users\\pc\\Desktop\\Test.txt";
//        if (ischeck(path)) {
//            System.out.println("file đã tồn tại");
//        } else {
//            System.out.println("file chưa tồn tại");
//        }

//         Q2();
//         Q3();
//        Q5();
//        Q6();
//Q9();
    }
}
