import java.io.*;
import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        File file = new File("D:\\overwolf");
//        System.out.println(file.exists());
//        String[] fileName = file.list();
//        for (String name : fileName) {
//            System.out.println(name);
//        }
//
//        File[] files = file.listFiles();
//        for (File f : files) {
//            if (f.isFile()) {
//                System.out.println(f.getName());
//            }
//        }

//        FileInputStream fileInputStream = new FileInputStream("D:/DTN_2502/Hoang_Trung_Kien/test.txt");
//
//        byte[] b = new byte[1024];
//        int length = fileInputStream.read(b);
//        while (length > -1) {
//            String str = new String(b, 0, length);
//            System.out.println(str);
//            length = fileInputStream.read(b);
//        }
//        fileInputStream.close();
//
//        try (FileOutputStream fileOutputStream = new FileOutputStream("D:/DTN_2502/Hoang_Trung_Kien/test.txt", true)) {
//
//            String out = "\ncong chua Hoang Khanh Linh";
//            byte[] outb = out.getBytes();
//            fileOutputStream.write(outb);
//        } catch (Exception e) {
//            System.out.println();
//        }

//        Department department = new Department(1, "Sale");
//        FileOutputStream fileOutputStream = new FileOutputStream("D:/DTN_2502/Hoang_Trung_Kien/test.ser");
//        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//        objectOutputStream.writeObject(department);
//        fileOutputStream.close();
//        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("D:/DTN_2502/Hoang_Trung_Kien/test.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Department department = (Department) objectInputStream.readObject();
        System.out.println(department);
//        ArrayList<Department> departments = (ArrayList<Department>) objectInputStream.readObject();
//        System.out.println(departments);
        fileInputStream.close();
        objectInputStream.close();


    }
}