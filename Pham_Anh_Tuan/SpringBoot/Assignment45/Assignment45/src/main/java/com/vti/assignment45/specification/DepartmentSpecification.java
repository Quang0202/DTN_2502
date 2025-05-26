package com.vti.assignment45.specification;

import com.vti.assignment45.entity.Department;
import org.springframework.data.jpa.domain.Specification;

public class DepartmentSpecification {

    public static Specification<Department> searchByName(String name) {
        return (root, query, cb) -> {
            if (name == null || name.trim().isEmpty()) {
                return null;
            }
            return cb.like(cb.lower(root.get("departmentName")), "%" + name.toLowerCase() + "%");
        };
    }
}