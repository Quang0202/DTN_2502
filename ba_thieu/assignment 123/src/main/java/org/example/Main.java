package org.example;

import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // class Department
        class Department {
           public int departmentId ;
           public String departmentName ;
        };
        // class Position
        class Position {
            public int positionId ;
            public String positionName ;
        };
        // class Account
        class Account {
            public int accountId ;
            public String email ;
            public String userName ;
            public String fullName ;
            public int departmentId ;
            public int positionId;
            public LocalDate createDate ;
        };
        // class Group
        class Group {
            public int groupID ;
            public String groupName ;
            public int createId ;
            public LocalDate createDate ;
        };
        // class GroupAccount
        class GroupAccount {
            public int groupID ;
            public int accountId ;
            public LocalDate joinDate ;
        };
        // class TypeQuestion
        class TypeQuestion {
            public int typeId ;
            public String typeName ;
        };
        // class CategoryQuestion
        class CategoryQuestion {
            public int categoryID ;
            public String categoryName ;
        };
        // class Question
        class Question {
            public int questionId ;
            public String content ;
            public int categoryId ;
            public int typeId ;
            public int creatorId ;
            public LocalDate createDate ;
        };
        // class Answer
        class Answer {
            public int answerId ;
            public String content ;
            public int questionId ;
            public int idCorrect ;
        };
        // class Exam
        class Exam {
            public int examId ;
            public int code ;
            public String title ;
            public int categoryID ;
            public int duration ;
            public int creatorId ;
            public LocalDate createDate ;
        };
        // class ExamQuestion
        class ExamQuestion {
            public int examId ;
            public int questionId ;
        };
    }
}

















