import java.time.LocalDateTime;
import java.util.Arrays;

public class Account {
     int account_id;

     @Override
     public String toString() {
          return "Account{" +
                  "account_id=" + account_id +
                  ", Email='" + Email + '\'' +
                  ", Username='" + Username + '\'' +
                  ", Full_Name='" + Full_Name + '\'' +
                  ", department=" + department +
                  ", position=" + position +
                  ", CreateDate=" + CreateDate +
                  ", groups=" + Arrays.toString(groups) +
                  '}';
     }

     String Email;
     String Username;
     String Full_Name;
     Department department;
     Position position;
     LocalDateTime CreateDate;
     Group[] groups;
}
