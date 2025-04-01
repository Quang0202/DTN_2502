package com.company.frontend.TestingSystem3;

import com.company.backend.TestingSystem3.Exercise5;
import com.company.entity.Department;

public class Program5 {
    public static void main(String[] args) {
        Department department1 = new Department(1, "Dev");
        Department department2 = new Department(2, "HR");
        Department department3 = new Department(3, "R&D");
        Department department4 = new Department(4, "Director");
        Department department5 = new Department(5, "Sale");
        Department[] departments = {department1, department2, department3, department4, department5};
        Exercise5 exercise = new Exercise5();
        exercise.q6(departments);
    }
}
