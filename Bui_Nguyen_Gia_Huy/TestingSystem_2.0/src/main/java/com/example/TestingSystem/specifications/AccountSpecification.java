package com.example.TestingSystem.specifications;

import com.example.TestingSystem.entity.Account;
import com.example.TestingSystem.entity.Department;
import com.example.TestingSystem.entity.Position;
import jakarta.persistence.criteria.*;
import org.springframework.data.jpa.domain.Specification;

public class AccountSpecification {
    public static Specification<Account> searchKeyword(String keyword) {
        return (root, query, cb) -> {
            if (keyword == null || keyword.isBlank()) return null;
            String pattern = "%" + keyword.trim().toLowerCase() + "%";

            Join<Account, Department> dept = root.join("department", JoinType.LEFT);
            Join<Account, Position> pos = root.join("position", JoinType.LEFT);

            return cb.or(
                    cb.like(cb.lower(root.get("username")), pattern),
                    cb.like(cb.lower(root.get("fullName")), pattern),
                    cb.like(cb.lower(dept.get("departmentName")), pattern),
                    cb.like(cb.lower(pos.get("positionName").as(String.class)), pattern)
            );
        };
    }
}
