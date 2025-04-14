package vti.accountmanagement.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import vti.accountmanagement.model.Account;

import java.util.List;
import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {
    List<Account> findByDepartment_DepartmentId(int id);

    Optional<Account> findByUsername(String username);

    Boolean existsAccountByEmail(String email);

    Boolean existsAccountByUsername(String username);

    Boolean existsAccountByEmailAndAccountIdNot(String email, int id);

    @Query(value = "SELECT acc FROM Account acc " +
            "WHERE acc.username LIKE %:search% " +
            "OR acc.fullName LIKE %:search% " +
            "OR acc.email LIKE %:search% " +
            "OR acc.department.departmentName LIKE %:search% " +
            "OR CAST(acc.position.positionName as string) LIKE %:search%"
    )
    Page<Account> findAll(Pageable pageable, String search);
}
