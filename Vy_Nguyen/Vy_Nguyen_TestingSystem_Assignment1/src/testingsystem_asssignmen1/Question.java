package testingsystem_asssignmen1;

import testingsystem_asssignmen1.Account;
import testingsystem_asssignmen1.CategoryQuestion;

import java.util.Date;

public class Question {
    public int questionId;
    public String content;
    public CategoryQuestion categoryQuestion;
    public TypeQuestion typeQuestion;
    public Account creator;
    public Date createDate;

    public Question(int questionId, String content, CategoryQuestion categoryQuestion, TypeQuestion typeQuestion, Account creator, Date createDate){
        this.questionId = questionId;
        this.content = content;
        this.categoryQuestion = categoryQuestion;
        this.typeQuestion = typeQuestion;
        this.creator = creator;
        this.createDate = createDate;
    }

}
