package vti.fe.assignmentday08;

import vti.data.Department;
import vti.utils.IOManager;

import java.io.IOException;

import static vti.utils.IOManager.ReadObject;
import static vti.utils.IOManager.WriteObject;

public class Demo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        IOManager obj = new IOManager();
        // Exercise03 Question01
        Department department = new Department(1, "Department 1");

//        obj.readFile("D:\\\\\\\\Data\\\\\\\\test\\\\\\\\test1.txt");
//        obj.writeFile("D:\\\\\\\\Data\\\\\\\\test\\\\\\\\test1.txt", "Hello World");
//        WriteObject("D:\\\\\\\\Data\\\\\\\\test\\\\\\\\test1.ser" , "D:\\\\Data\\\\test", department );
        ReadObject("D:\\\\\\\\Data\\\\\\\\test\\\\\\\\test1.ser" , "D:\\\\\\\\Data\\\\\\\\test", department );



    }
}
