package vti.data;


import java.time.LocalDateTime;

public class Exam {
    public int exam_id;
    public int code;
    public Categoryquestion categoryquestion;
    public String durations;
    public Account creator;
    public LocalDateTime creation_date;
    public Question[] questions;
}
