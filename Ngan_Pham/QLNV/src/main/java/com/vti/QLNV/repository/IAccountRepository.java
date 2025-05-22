package com.vti.QLNV.repository;

import com.vti.QLNV.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IAccountRepository extends JpaRepository<Account, Integer> {
    boolean existsByEmail(String email);
    boolean existsByUserName(String userName);
}
