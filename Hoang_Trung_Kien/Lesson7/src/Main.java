import java.io.File;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\overwolf");
        System.out.println(file.exists());
        String[] fileName = file.list();
        for (String name : fileName) {
            System.out.println(name);
        }

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isFile()) {
                System.out.println(f.getName());
            }
        }
    }
}