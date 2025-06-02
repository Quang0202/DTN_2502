package com.vti.hello.specification;

import com.vti.hello.entity.Account;
import com.vti.hello.entity.Department;
import org.springframework.data.jpa.domain.Specification;

public class DepartmentSpecification {
    public static Specification<Department> searchByDepartmentName(String value) {
        return ((root, query, criteriaBuilder) -> {
            return (value == null) ? null : criteriaBuilder.like(root.get("departmentName"), "%" + value + "%");
        });
    }

    public static Specification<Department> greaterThanId(Integer minId) {
        return ((root, query, criteriaBuilder) -> {
            return (minId == null) ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("departmentId"), minId);
        });
    }

    public static Specification<Department> lessThanId(Integer maxId) {
        return ((root, query, criteriaBuilder) -> {
            return (maxId == null) ? null : criteriaBuilder.lessThanOrEqualTo(root.get("departmentId"), maxId);
        });
    }
}
