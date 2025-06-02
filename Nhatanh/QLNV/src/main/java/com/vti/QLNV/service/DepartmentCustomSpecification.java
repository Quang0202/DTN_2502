package com.vti.QLNV.service;

import com.vti.QLNV.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.lang.NonNull;

public class DepartmentCustomSpecification implements Specification<Account> {

    @NonNull
    private String field;

    @NonNull
    private Object value;


    @Override
    public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        if (field.equalsIgnoreCase("departmentName")){
            return criteriaBuilder.like(root.get("departmentName"), "%" + value.toString() + "%");
        }
        return null;
    }
}
