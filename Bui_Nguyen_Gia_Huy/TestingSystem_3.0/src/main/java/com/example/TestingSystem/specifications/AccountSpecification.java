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
            String searchTerm = keyword.trim().toLowerCase();
            String pattern = "%" + searchTerm + "%";

            Join<Account, Department> dept = root.join("department", JoinType.LEFT);
            Join<Account, Position> pos = root.join("position", JoinType.LEFT);

            // Create individual predicates for each searchable field
            Predicate usernamePredicate = cb.like(cb.lower(root.get("username")), pattern);
            Predicate fullNamePredicate = cb.like(cb.lower(root.get("fullName")), pattern);
            Predicate departmentPredicate = cb.like(cb.lower(dept.get("departmentName")), pattern);

            // Position predicate with enum keyword matching
            Predicate positionPredicate = cb.disjunction(); // Start with false
            for (Position.PositionName positionName : Position.PositionName.values()) {
                if (matchesPositionKeyword(positionName, searchTerm)) {
                    positionPredicate = cb.or(positionPredicate,
                            cb.equal(pos.get("positionName"), positionName));
                }
            }

            // Return OR of all predicates - matches if keyword found in ANY field
            return cb.or(usernamePredicate, fullNamePredicate, departmentPredicate, positionPredicate);
        };
    }

    // Helper method to check if search term matches position enum
    private static boolean matchesPositionKeyword(Position.PositionName position, String searchTerm) {
        String enumName = position.name().toLowerCase();
        String formattedName = enumName.replace("_", " ");

        // Direct substring match in enum name or formatted name
        if (enumName.contains(searchTerm) || formattedName.contains(searchTerm)) {
            return true;
        }

        // Check individual words separated by underscore
        String[] words = enumName.split("_");
        for (String word : words) {
            if (word.contains(searchTerm)) {
                return true;
            }
        }

        return false;
    }
}