import java.time.LocalDate;

public class Exam {
     int id;
     int Code;
     String title;
     CategoryQuestion categoryID;
     LocalDate duration;
     Group CreateID;
     LocalDate createDate;
     Question[]  questions;

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", Code=" + Code +
                ", title='" + title + '\'' +
                ", categoryID=" + categoryID +
                ", duration=" + duration +
                ", CreateID=" + CreateID +
                ", createDate=" + createDate +

                '}';
    }
}
