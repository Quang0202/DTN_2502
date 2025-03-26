import java.time.LocalDate;

public class Question {
    private int questionID;
    private String content;
    private CategoryQuestion category;
    private TypeQuestion type;
    private Account creator;
    private LocalDate createDate;

    public Question(int questionID, String content, CategoryQuestion category, TypeQuestion type, Account creator, LocalDate createDate) {
        this.questionID = questionID;
        this.content = content;
        this.category = category;
        this.type = type;
        this.creator = creator;
        this.createDate = createDate;
    }

    public CategoryQuestion getCategory() {
        return category;
    }

    public void setCategory(CategoryQuestion category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Account getCreator() {
        return creator;
    }

    public void setCreator(Account creator) {
        this.creator = creator;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public TypeQuestion getType() {
        return type;
    }

    public void setType(TypeQuestion type) {
        this.type = type;
    }
}
