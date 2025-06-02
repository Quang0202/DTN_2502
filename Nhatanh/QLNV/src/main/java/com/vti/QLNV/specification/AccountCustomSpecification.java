package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;

public class AccountCustomSpecification implements Specification<Account> {

    @NonNull
    private String field;

    @NonNull
    private Object value;


    @Override
    public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if (field.equalsIgnoreCase("username")){
            return criteriaBuilder.like(root.get("username"), "%" + value.toString() + "%");
        }
        return null;
    }
}
