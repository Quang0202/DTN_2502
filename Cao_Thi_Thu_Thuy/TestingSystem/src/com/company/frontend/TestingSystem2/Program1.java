package com.company.frontend.TestingSystem2;

import com.company.backend.TestingSystem2.Exercise1;
import com.company.entity.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class Program1 {
    public static void main(String[] args) {
        // department
        Department department1 = new Department(1, "IT");
        Department department2 = new Department(2, "Sale");
        Department department3 = new Department(3, "HR");
        // position
        Position position1 = new Position(1, EPositionName.PM);
        Position position2 = new Position(2, EPositionName.Dev);
        Position position3 = new Position(3, EPositionName.Scrum);
        // account
        Account account1 = new Account(1, "acc1@gmail.com", "ac1", "ac1", department1, position1, LocalDate.of(2022, 1, 5));
        Account account2 = new Account(2, "acc2@gmail.com", "ac2", "ac2", department2, position2, LocalDate.of(2022, 2, 5));
        Account account3 = new Account(3, "acc3@gmail.com", "ac3", "ac3", department3, position3, LocalDate.of(2022, 3, 5));
        ArrayList<Account> accounts = new ArrayList<>();
        accounts.add(account1);
        accounts.add(account2);
        accounts.add(account3);
        //group
        Group group1 = new Group(1, "group1", account1, LocalDate.of(2023, 10, 12));
        Group group2 = new Group(2, "group2", account2, LocalDate.of(2023, 10, 15));
        Group group3 = new Group(3, "group3", account3, LocalDate.of(2022, 10, 19));
        // typequestion
        TypeQuestion typeQuestion1 = new TypeQuestion(1, ETypeQuestion.Essay);
        TypeQuestion typeQuestion2 = new TypeQuestion(2, ETypeQuestion.MultipleChoice);
        // categoryquestion
        CategoryQuestion categoryQuestion1 = new CategoryQuestion(1, "Java");
        CategoryQuestion categoryQuestion2 = new CategoryQuestion(2, "SQL");
        CategoryQuestion categoryQuestion3 = new CategoryQuestion(3, "Python");
        // question
        Question question1 = new Question(1, "When was Java born?", categoryQuestion1, typeQuestion1, account1, LocalDate.of(2024, 04, 12));
        Question question2 = new Question(2, "When was SQL born?", categoryQuestion2, typeQuestion1, account2, LocalDate.of(2024, 04, 12));
        Question question3 = new Question(3, "When was Python born?", categoryQuestion3, typeQuestion1, account3, LocalDate.of(2024, 04, 12));
        // answer
        Answer answer1 = new Answer(1, "I don't know", question1, false);
        Answer answer2 = new Answer(2, "I don't know", question2, false);
        Answer answer3 = new Answer(3, "I don't know", question1, false);
        // exam
        Exam exam1 = new Exam(1, "APTX-0087", "Exam 01", categoryQuestion1, 120, account1, LocalDate.of(2024, 05, 12));
        Exam exam2 = new Exam(2, "APTX-0088", "Exam 02", categoryQuestion1, 120, account1, LocalDate.of(2024, 05, 12));
        Exam exam3 = new Exam(3, "APTX-0089", "Exam 03", categoryQuestion1, 120, account1, LocalDate.of(2024, 05, 12));

        // groupaccount
        GroupAccount ga1 = new GroupAccount(group1, account2, LocalDate.of(2023, 10, 13));
        GroupAccount ga2 = new GroupAccount(group2, account3, LocalDate.of(2023, 10, 21));
        GroupAccount ga3 = new GroupAccount(group3, account1, LocalDate.of(2023, 10, 23));
        ArrayList<GroupAccount> listGroupAccount = new ArrayList();
        listGroupAccount.add(ga1);
        listGroupAccount.add(ga2);
        listGroupAccount.add(ga3);
        // examquestion
        ExamQuestion eq1 = new ExamQuestion(exam1, question1);
        ExamQuestion eq2 = new ExamQuestion(exam2, question2);
        ExamQuestion eq3 = new ExamQuestion(exam3, question3);
        ArrayList<ExamQuestion> listExamQuestion = new ArrayList();
        listExamQuestion.add(eq1);
        listExamQuestion.add(eq2);
        listExamQuestion.add(eq3);
        Exercise1 exercise = new Exercise1();
        exercise.q1(account1);
    }
}
