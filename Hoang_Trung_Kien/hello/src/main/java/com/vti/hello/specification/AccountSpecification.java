package com.vti.hello.specification;

import com.vti.hello.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class AccountSpecification {
    public static Specification<Account> searchByUsername(String value) {
        return ((root, query, criteriaBuilder) -> {
            return (value == null) ? null : criteriaBuilder.like(root.get("username"), "%" + value + "%");
        });
    }

    public static Specification<Account> greaterThanId(Integer minId) {
        return ((root, query, criteriaBuilder) -> {
            return (minId == null) ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("accountId"), minId);
        });
    }

    public static Specification<Account> lessThanId(Integer maxId) {
        return ((root, query, criteriaBuilder) -> {
            return (maxId == null) ? null : criteriaBuilder.lessThanOrEqualTo(root.get("accountId"), maxId);
        });
    }

    public static Specification<Account> minDate(LocalDateTime dateTime) {
        return ((root, query, criteriaBuilder) -> {
            return (dateTime == null) ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("createDate"), dateTime);
        });
    }
}
