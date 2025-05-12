package backend.controller;

import backend.entity.Account;
import backend.repository.AccountRepository;
import backend.entity.Department;
import backend.repository.DepartmentRepository;

import java.util.List;

public class Exercise2 {
    public void ques2() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartmentById(2);
        System.out.println(department);
    }

    public void ques3() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        Department department = departmentRepository.getDepartmentById();
        System.out.println(department);
    }

    public void ques4() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        System.out.println(departmentRepository.isDepartmentNameExist("asd "));
    }

    public void ques5() {
        DepartmentRepository departmentRepository = new DepartmentRepository();
        departmentRepository.createDepartment("chill");
    }
    public void ques8_1() {
        AccountRepository accountRepository = new AccountRepository();
        List<Account> accounts = accountRepository.getAllAccounts();
        for (Account account : accounts) {
            System.out.println(account);
        }
    }
}
