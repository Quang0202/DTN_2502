package com.testingsystem_assignment_1;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        //Department
        Department department1 = new Department(1,"Tester");
        Department department2 = new Department(2,"Dev");
        Department department3 = new Department(3,"BA");

        //Position
        Position position1 = new Position(1,"Truong phong");
        Position position2 = new Position(2,"Nhan vien");
        Position position3 = new Position(3,"Quan ly");

        Account account1 = new Account(1,"phamanhtuan1","tuan1@gmail.com","Pham Anh Tuan 1",Gender.MALE,department1,position1,new Date());
        Account account2 = new Account(2,"phamanhtuan2","tuan2@gmail.com","Pham Anh Tuan 2",Gender.FEMALE,department2,position2,new Date());
        Account account3 = new Account(3,"phamanhtuan3","tuan3@gmail.com","Pham Anh Tuan 3",Gender.UNKNOWN,department3,position3,new Date());

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);

        // Group
        Group group1 = new Group(1, "Automation Testing", account1, new Date());
        Group group2 = new Group(2, "Development Team", account2, new Date());

        System.out.println("==== Group List ====");
        System.out.println(group1);
        System.out.println(group2);

        // TypeQuestion
        TypeQuestion type1 = new TypeQuestion(1, "Essay");
        TypeQuestion type2 = new TypeQuestion(2, "Multiple Choice");

        System.out.println("==== TypeQuestion List ====");
        System.out.println(type1);
        System.out.println(type2);

        // CategoryQuestion
        CategoryQuestion category1 = new CategoryQuestion(1, "Java");
        CategoryQuestion category2 = new CategoryQuestion(2, "Database");
        CategoryQuestion category3 = new CategoryQuestion(3, "Networking");

        System.out.println("==== CategoryQuestion List ====");
        System.out.println(category1);
        System.out.println(category2);
        System.out.println(category3);

        // Tạo Question
        Question question1 = new Question(1, "What is Java?", category1, type1, account1, new Date());
        Question question2 = new Question(2, "What is SQL?", category2, type2, account2, new Date());
        Question question3 = new Question(3, "What is Python?", category2, type2, account2, new Date());

        System.out.println("==== Question List ====");
        System.out.println(question1);
        System.out.println(question2);

        // Tạo Answer
        Answer answer1 = new Answer(1, "Java is a programming language.", question1, true);
        Answer answer2 = new Answer(2, "Java is a type of coffee.", question1, false);
        Answer answer3 = new Answer(3, "SQL is a programming language.", question2, false);

        System.out.println("==== Answer List ====");
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

        // Exam
        Exam exam1 = new Exam(1, "J101", "Java Basic", category1, 60, account1, new Date());
        Exam exam2 = new Exam(2, "SQL201", "Advanced SQL", category2, 90, account2, new Date());
        Exam exam3 = new Exam(3, "NET301", "Networking Essentials", category3, 45, account1, new Date());

        System.out.println("==== Exam List ====");
        System.out.println(exam1);
        System.out.println(exam2);
        System.out.println(exam3);

        // Tạo ExamQuestion (Gán câu hỏi vào đề thi)
        ExamQuestion eq1 = new ExamQuestion(1, question1);
        ExamQuestion eq2 = new ExamQuestion(1, question3);
        ExamQuestion eq3 = new ExamQuestion(2, question2);

        System.out.println("==== ExamQuestion List ====");
        System.out.println(eq1);
        System.out.println(eq2);
        System.out.println(eq3);

        // Question 3: Trong file Program.java, hãy in ít nhất 1 giá trị của mỗi đối tượng ra
        System.out.println("==== In doi tuong ====\n");
        System.out.println("CategoryQuestion: " + category1.categoryName + "\n");
        System.out.println("TypeQuestion: " + type1.typeName + "\n");
        System.out.println("Department: " + department1.departmentName + "\n");
        System.out.println("Position: " + position1.positionName + "\n");
        System.out.println("Account: " + account1.fullName + " - " + account1.email + "\n");
        System.out.println("Question: " + question1.content + "\n");
        System.out.println("Answer: " + answer1.content + " (Correct: " + answer1.isCorrect + ")\n");
        System.out.println("Exam: " + exam1.title + " (Duration: " + exam1.duration + " mins)\n");
        System.out.println("Group: " + group1.groupName + "\n");
        System.out.println("ExamQuestion: " + eq1 + "\n");
    }
}