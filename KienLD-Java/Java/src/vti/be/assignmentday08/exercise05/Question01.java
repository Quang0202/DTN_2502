
package vti.be.assignmentday08.exercise05;

import java.io.*;
import java.util.ArrayList;

public class Question01 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // a)
//        Student student01 = new Student(); Student student02 = new Student(); Student student03 = new Student();
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(student01);
//        students.add(student02);
//        students.add(student03);


//        WriteObject("D:\\\\\\\\\\\\\\\\Data\\\\\\\\\\\\\\\\test\\\\\\\\\\\\\\\\StudentInformation.ser", students);
//        System.out.println(ReadObject("D:\\\\\\\\\\\\\\\\Data\\\\\\\\\\\\\\\\test\\\\\\\\\\\\\\\\StudentInformation.ser"));

    }

    public static void WriteObject(String fileName, ArrayList<Student> students) throws IOException {

        File file = new File(fileName);
        if (!file.exists()) {
            throw new FileNotFoundException(fileName);
        }
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(students);
        System.out.println("Written object successfully");
        oos.close();
    }

    public static ArrayList<Student> ReadObject(String fileName) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        ObjectInputStream ois = new ObjectInputStream(fis);
        return (ArrayList<Student>) ois.readObject();
    }
}
