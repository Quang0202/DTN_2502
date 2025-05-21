package com.vti.testingsytem.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.context.properties.bind.DefaultValue;

import java.time.LocalDate;
import java.util.Set;

@Entity
@JsonIgnoreProperties({"questions", "exams", "groups"})
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String fullName;

    @Column(updatable = false)
    @CreationTimestamp
    private LocalDate createDate;

    @ManyToOne()
    @JoinColumn(name = "departmentId")
    @JsonIgnoreProperties("accounts")
    private Department department;

    @ManyToOne()
    @JoinColumn(name = "positionId")
    @JsonIgnoreProperties("accounts")
    private Position position;

    @OneToMany(mappedBy = "createAccount", fetch = FetchType.LAZY)
    private Set<Question> questions;

    @OneToMany(mappedBy = "createAccount", fetch = FetchType.LAZY)
    private Set<Exam> exams;

    @OneToMany(mappedBy = "createAccount", fetch = FetchType.LAZY)
    private Set<Group> groups;

    public Account() {
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Set<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<Question> questions) {
        this.questions = questions;
    }

    public Set<Exam> getExams() {
        return exams;
    }

    public void setExams(Set<Exam> exams) {
        this.exams = exams;
    }

    public Set<Group> getGroups() {
        return groups;
    }

    public void setGroups(Set<Group> groups) {
        this.groups = groups;
    }
}
