package testingsystem_asssignmen1;

import testingsystem_asssignmen1.Account;
import testingsystem_asssignmen1.CategoryQuestion;

import java.util.Date;
public class Exam {
    public int examId;
    public String code;
    public String title;
    public CategoryQuestion categoryQuestion;
    public int duration;
    public Account creator;
    public Date createDate;

    public Exam(int examId, String code, String title, CategoryQuestion categoryQuestion, int duration, Account creator, Date createDate) {
        this.examId = examId;
        this.code = code;
        this.title = title;
        this.categoryQuestion = categoryQuestion;
        this.duration = duration;
        this.creator = creator;
        this.createDate = createDate;
    }
}
