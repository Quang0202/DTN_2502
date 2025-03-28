import java.time.format.DateTimeFormatter;

public class Excercise2 {
    void ques6(Account[] accounts) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy hh'h':mm'p':ss's'");
        System.out.println("accountID,        userName,                          email,                fullName,    gender,         department,        position,                createDate");
        for (Account account : accounts) {
            System.out.printf("%9s, %15s, %30s, %23s, %9s, %18s, %15s, %25s\n", account.accountId, account.userName, account.email, account.fullName, account.gender, account.department.departmentName, account.position.positionName, account.createDate.format(dateTimeFormatter));
        }
    }
}
