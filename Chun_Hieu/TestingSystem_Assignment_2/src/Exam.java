import java.util.Date;

public class Exam {
    String title;
    Date createDate;

    public Exam(String title, Date createDate) {
        this.title = title;
        this.createDate = createDate;
    }
    @Override
    public String toString() {
        return "Exam{" +
                "title='" + title + '\'' +
                ", createDate=" + createDate +
                '}';
    }
}
