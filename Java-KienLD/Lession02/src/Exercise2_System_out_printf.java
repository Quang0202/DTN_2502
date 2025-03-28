import java.nio.file.attribute.GroupPrincipal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Exercise2_System_out_printf {
    public static void main(String[] args) {
        // Question01
        System.out.println("Question01");
        int a  = 5;
        System.out.println(a);
        // Question02
        System.out.println("Question02");
        int b  = 100000000;
        System.out.printf("%,d%n", b);
        // Question03
        System.out.println("Question03");
        double c = 5.567098;
        System.out.printf("%.4f%n", c);

        // Question04
        System.out.println("Question04");
        String fullname = "Nguyen Van A";
        System.out.printf("Ten toi la \"%s\" va toi dang doc than%n" , fullname);


        System.out.println("Question05");

        LocalDateTime today = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        System.out.println(today.format(formatter));

        System.out.println("Question06");

        //

        Department department1 = new Department();
        department1.department_id = 1;
        department1.department_name = "PKT";

        Position position1 = new Position();
        position1.position_id = 1; position1.position_name = "Dev";

        Group group1 = new Group();
        group1.group_id = 1; group1.group_name = "Development";

        Account account1 = new Account();
        account1.account_id = 1; account1.Email = "nguyen@gmail.com"; account1.Username = "kienld"; account1.Full_Name = "Lai Duc Kien"; account1.department = department1;
        account1.position  = position1; account1.CreateDate = LocalDateTime.now(); Group[] groups = {group1};account1.groups = groups;

        Account[] accounts =  { account1 };
        System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-250s %n",  "id", "Email", "Username", "Full Name", "department_id", "position_id", "CreateDate", "gracc01");


        for (Account account : accounts) {
            String groupNames = "";
            for (Group group : account.groups) {
                groupNames += group.group_name + " ";
            }
                System.out.printf("%-5s |  %-25s | %-25s | %-25s   | %-25s | %-25s | %-25s | %-150s %n", account.account_id, account.Email, account.Username, account.Full_Name, account.department.department_id,
                        account.position.position_id, account.CreateDate, groupNames.trim());



        }






    }
}
