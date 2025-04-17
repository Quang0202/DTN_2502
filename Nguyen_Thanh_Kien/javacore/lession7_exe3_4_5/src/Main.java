import model.Student;
import utils.FileManager;
import utils.IOManager;
import utils.LogUtils;
import utils.MyException;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static final String pathFolderName = "\\src\\document\\";

    public static void main(String[] args) throws IOException {
//        question 1
//        System.out.println(FileManager.isFileExist(pathFolderName + "\\\\rename.txt"));
//        question 2
//        FileManager.createNewFile(pathFolderName + "\\\\test.txt");

//        question 4
//        FileManager.deleteFile(pathFolderName + "test.txt");

//        question 5
//        System.out.println(FileManager.isFolder(pathFolderName + "\\\\test.txt"));

//        question 6
//        for (String s : FileManager.getAllFileName(pathFolderName)) {
//            System.out.println(s);
//        }

//        question 7
//        FileManager.copyFile(pathFolderName + "\\\\test.txt\\", "\\\\src\\document2\\abc.txt");
//        FileManager.copyFile(pathFolderName + "test.txt", "\\src\\document2", "xyz.txt");

//      question 8
//        FileManager.moveFile(pathFolderName + "test.txt", "\\src\\document2\\test.txt");

//      question 9
//        FileManager.renameFile(pathFolderName + "test1.txt", "rename.txt");

//      question 10
//        FileManager.createNewFolder("\\src\\newFolder");

//      question 11
//        FileManager.downloadFile("https://file-examples.net/wp-content/uploads/2024/02/SampleTextFile_1MB.txt",pathFolderName);

//      exe4 question 1
//        System.out.println(IOManager.readFile(pathFolderName + "rename.txt"));

//      exe4 question 2
//        IOManager.writeFile(pathFolderName+ "rename.txt", false, "abc");

//      exe4 question 3
//        IOManager.writeObject(new Student(12, "abc"),pathFolderName, "rename.txt");

//      exe4 question 4
//        System.out.println(IOManager.readObject(pathFolderName + "rename.txt"));

//        exe5 question 1
//        ArrayList<Student> students = new ArrayList<>();
//        Student student = new Student(1,"Nguyen Van A");
//        students.add(student);
//        student = new Student(2,"Nguyen Van B");
//        students.add(student);
//        student = new Student(3,"Nguyen Van C");
//        students.add(student);
//        String content = "";
//        for (int i = 0; i < students.size(); i++) {
//            content += "Student " + (i+1) + ":\n" +
//                    "\t\tId: " + students.get(i).getId() +"\n" +
//                    "\t\tName: " + students.get(i).getName() +"\n";
//        }
//        IOManager.writeFile(pathFolderName+ "StudentInformation.txt", false, content);

//        exe5 question 2
//       String[] temp = {"1"};
//       try{
//           System.out.println(temp[2]);
//       }catch (ArrayIndexOutOfBoundsException e){
//           LogUtils.writeLog(new MyException(e.getMessage(),new Throwable(e).getCause().toString(),e.getStackTrace(), LocalDateTime.now()));
//       }
//        LogUtils.readLog();

        
    }
}