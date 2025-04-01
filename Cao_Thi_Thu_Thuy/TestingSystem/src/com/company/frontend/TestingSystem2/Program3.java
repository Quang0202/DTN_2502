package com.company.frontend.TestingSystem2;

import com.company.backend.TestingSystem2.Exercise3;
import com.company.entity.Account;
import com.company.entity.Department;
import com.company.entity.EPositionName;
import com.company.entity.Position;

import java.time.LocalDate;

public class Program3 {
    public static void main(String[] args) {
        Department department1 = new Department(1, "IT");
        Position position1 = new Position(1, EPositionName.PM);
        Account account1 = new Account(1, "acc1@gmail.com", "ac1", "ac1", department1, position1, LocalDate.of(2022, 1, 5));
        Exercise3 exercise = new Exercise3();
        exercise.q5(account1);
    }
}
