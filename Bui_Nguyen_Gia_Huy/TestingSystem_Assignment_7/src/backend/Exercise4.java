package backend;

import utils.IOManager;

public class Exercise4 {
    public void question1() {
        try {
            String content = IOManager.readFile("C:\\TestFile\\test.txt");
            System.out.println("File content: " + content);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question2() {
        try {
            // Write new content
            IOManager.writeFile("C:\\TestFile\\test.txt", "New content", false);
            System.out.println("Content written successfully");

            // Append content
            IOManager.writeFile("C:\\TestFile\\test.txt", "\nAppended content", true);
            System.out.println("Content appended successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question3() {
        try {
            String obj = "This is a test object";
            IOManager.writeObject(obj, "C:\\TestFile", "object.ser");
            System.out.println("Object written successfully");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void question4() {
        try {
            Object obj = IOManager.readObject("C:\\TestFile\\object.ser");
            System.out.println("Read object: " + obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
