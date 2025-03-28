import java.time.LocalDateTime;

public class Exam {
    public int exam_id;
    public Number code;
    public String title;
    public CategoryQuestion category;
    public String duration;
    public Account creator;
    public LocalDateTime CreateDate;
    public  Question[] questions;
    public CategoryQuestion[] categoryQuestions;

}
