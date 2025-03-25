import java.time.LocalDateTime;
import java.util.Arrays;

public class Question {

     int id;
     String content;
     CategoryQuestion CategoryID;
     TypeQuestion TypeID;
     int CreatorID;
     LocalDateTime createDate;
     Exam[] exams;

     @Override
     public String toString() {
          return "Question{" +
                  "id=" + id +
                  ", content='" + content + '\'' +
                  ", CategoryID=" + CategoryID +
                  ", TypeID=" + TypeID +
                  ", categoryID=" + CreatorID +
                  ", createDate=" + createDate +
                  ", exams=" + Arrays.toString(exams) +
                  '}';
     }
}
