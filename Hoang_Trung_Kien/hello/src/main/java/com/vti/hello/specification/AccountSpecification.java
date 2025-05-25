package com.vti.hello.specification;

import com.vti.hello.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

public class AccountSpecification {
    public static Specification<Account> searchByUsername(String value) {
        return new Specification<Account>() {
            @Override
            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
                if(value != null) {
                    return criteriaBuilder.like(root.get("username"), "%" + value + "%");
                }
                return null;
            }
        };
    }
}
