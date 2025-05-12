import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractorSimple {
    public static void main(String[] args) throws FileNotFoundException {
        String filePath = "C:/Users/Admin/Documents/Zalo Received Files/Auto Ghost Story.json"; // đường dẫn tới file JSON của bạn
        StringBuilder contentBuilder = new StringBuilder();
        byte[] b = new byte[1024];

        try(FileInputStream fileInputStream = new FileInputStream(filePath)) {
            int length = fileInputStream.read(b);
            while (length > -1) {
                String str = new String(b, 0, length);
                contentBuilder.append(str);
                length = fileInputStream.read(b);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        String result = contentBuilder.toString();
        String s[] = result.split("\\s+|\"");
        List<String> emails = new ArrayList<>();
        for (String e : s) {
            if (e.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+"))
                emails.add(e);
        }

        for (String str : emails) {
            System.out.println(str);
        }
    }
}
