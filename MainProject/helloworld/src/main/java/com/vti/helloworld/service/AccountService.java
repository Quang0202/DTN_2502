package com.vti.helloworld.service;

import com.vti.helloworld.entity.Account;
import com.vti.helloworld.entity.Department;
import com.vti.helloworld.entity.Position;
import com.vti.helloworld.repository.IAccountRepository;
import com.vti.helloworld.repository.IDepartmentRepository;
import com.vti.helloworld.request.AccountRequestForm;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Collection;
import java.util.List;

public class AccountService implements IAccountservice{
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private IAccountRepository repository;
    @Autowired
    private IDepartmentRepository departmentRepository;

    @Override
    public void createAccount(AccountRequestForm accountForm, int id) throws Exception {
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

//            modelMapper.typeMap(AccountRequestForm.class, Account.class).addMappings(mapper -> {
//                mapper.map(Account::getFullName, AccountDto::setName);
//            })
//        if(!repository.existsById(id)){
//            throw new Exception();
//        }
        if(!repository.existsByEmail(accountForm.getEmail())){
            throw new Exception();
        }

        if(!repository.existsByUserName(accountForm.getUserName())){
            throw new Exception();
        }

        Account acount2 = repository.findById(id).orElse(null);
//            Account account = modelMapper.map(accountForm, Account.class);
//            account.setAccountId(id);
//            account.setDepartment(new Department(accountForm.getDepartmentId()));
//            account.setPosition(new Position(accountForm.getPositionId()));
        Department department = departmentRepository.findByDepartmentName(accountForm.getDepartmentName());
        if(department == null){
            department = departmentRepository.save(new Department(accountForm.getDepartmentName()));
        }
        acount2.setDepartment(department);
        acount2.setEmail(accountForm.getEmail());
        acount2.setFullName(accountForm.getFullName());
        acount2.setUserName(accountForm.getUserName());
        acount2.setPosition(new Position(accountForm.getPositionId()));
        repository.save(acount2);
    }
}
