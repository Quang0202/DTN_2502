package File;

import java.awt.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Filess {
    public static void main(String[] args)  {
//        File file = new File("D:\\Photography\\photo.txt");
//file.createNewFile();
//
//        FileInputStream fis = new FileInputStream("D:\\Photography\\photo.txt");
//
//
//        byte[] bytse = new byte[2024];
//
//        int length = fis.read(bytse);
//String result = "";
//        while (length > -1) {
//          String str = new String(bytse,0,length);
//          result += str;
//            System.out.println(str);
//            length = fis.read(bytse);
//        }
//        System.out.println(result);

//try( FileOutputStream fileOutputStream = new FileOutputStream(new File("D:\\Photography\\photo.txt"));
//FileInputStream fis = new FileInputStream("D:\\Photography\\photo.txt")
//) {
//    String out = "Nguyen van a";
//    byte [] bytes = out.getBytes();
//    fileOutputStream.write(out.getBytes());
//    System.out.println("Written to file");
//
//} catch (IOException e) {
//    e.printStackTrace();
//}


//Read object

//
//        Department desktop = new Department(1,"saff");
//        Department desktop2 = new Department(2,"bff");
//        Department desktop3 = new Department(3,"ass");
//        Department desktop4 = new Department(4,"qqrt");
//        Department desktop5 = new Department(5,"aas");
//        List<Department> departments = Arrays.asList(desktop,desktop2,desktop3,desktop4,desktop5);
//        try ( FileOutputStream fout = new FileOutputStream(new File("D:\\Photography\\test.ser"));
//        ObjectOutputStream out = new ObjectOutputStream(fout);
//        ){
//out.writeObject(departments);
//            System.out.println("Object written to file");
//        } catch (Exception e) {
//            System.out.println("Error writing to file");
//        }



        try ( FileInputStream fouts = new FileInputStream(new File("D:\\Photography\\test.ser"));
        ObjectInput out = new ObjectInputStream(fouts);
        ){
//           Department d = (Department) out.readObject();
            List<Department> dlist = (List<Department>)out.readObject();
            for (Department d : dlist) {
                System.out.println(d);
            }

        } catch (Exception e) {
            System.out.println("Error writing to file");
        }

    }
}
