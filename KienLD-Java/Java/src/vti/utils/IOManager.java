package vti.utils;

import vti.data.Department;
import java.io.Serializable;
import java.io.*;
import java.util.Scanner;

public class IOManager {
    // question01
    public static void readFile(String fileName) throws IOException {

        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException("File not found: " + fileName);
        }
        FileInputStream fileinputstream = new FileInputStream(fileName);
        byte[] buffer = new byte[1024];
        int byteread = fileinputstream.read(buffer); String data = "";
        while (byteread !=  -1 ) {
            data += new String(buffer, 0, byteread);
            byteread = fileinputstream.read(buffer); System.out.println("data: " + data);
        }
        fileinputstream.close();
    }
    // question02
    public static void writeFile(String fileName,  String data) throws IOException {
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 or 2 " );
        int choice = scanner.nextInt();
        if (choice == 1) {
            FileOutputStream fos = new FileOutputStream(fileName, true) ;
            byte[] dataBytes = data.getBytes();
            fos.write(dataBytes);
            System.out.println("Write Success Append True ");
            fos.close();
        }
        else if (choice == 2) {
            FileOutputStream fos2 = new FileOutputStream(fileName) ;
            byte[] dataBytes2 = data.getBytes();
            fos2.write(dataBytes2);
            System.out.println("Write Success Append False");
            fos2.close();
        }
        }
    public static void WriteObject(String fileName, String foldername, Department departmentname) throws IOException {
        if( departmentname == null){
            throw new NullPointerException("Department is null");
        }
        File file = new File(fileName);
        File foder = new File(foldername);
        if(!foder.exists()){
            foder.mkdir();
        }
        if (!file.exists()) {
            System.out.println("File not found: " + fileName);
        }
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(departmentname);
        System.out.println("Write Success");
    }

    public static void ReadObject(String fileName, String foldername, Department departmentname) throws IOException, ClassNotFoundException {
        File file = new File(fileName);
        File foder = new File(foldername);
        if(!foder.exists()){
            throw new FileNotFoundException("foldername not found: " + foldername);
        }
        if(!file.exists()){
            throw new FileNotFoundException("file not found: " + fileName);
        }

        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Department department = (Department) ois.readObject();
        System.out.println("Read Success" + department);

    }



    }
    // question03





