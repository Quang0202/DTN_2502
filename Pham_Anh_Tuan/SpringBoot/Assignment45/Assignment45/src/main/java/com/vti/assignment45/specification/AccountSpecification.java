package com.vti.assignment45.specification;

import com.vti.assignment45.entity.Account;
import org.springframework.data.jpa.domain.Specification;

public class AccountSpecification {

    public static Specification<Account> searchByUsername(String value) {
        return (root, query, criteriaBuilder) ->
                (value == null || value.isEmpty()) ? null :
                        criteriaBuilder.like(root.get("username"), "%" + value + "%");
    }
}
