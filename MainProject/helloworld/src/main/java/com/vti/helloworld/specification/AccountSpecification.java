package com.vti.helloworld.specification;

import com.vti.helloworld.entity.Account;
import jakarta.persistence.criteria.JoinType;
import org.springframework.data.jpa.domain.Specification;

import java.time.LocalDateTime;

public class AccountSpecification {
    public static Specification<Account> searchByUserName(String value) {
//        return new Specification<Account>() {
//            @Override
//            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                if(value!= null){
//                    return criteriaBuilder.like(root.get("userName"),"%"+ value+"%");
//                }
//                return null;
//            }
//        };
        return (root, query, criteriaBuilder) -> (value == null) ? null : criteriaBuilder.like(root.get("userName"), "%" + value + "%");
    }

    public static Specification<Account> greaterThanId(Integer minId) {
        return (root, query, criteriaBuilder) -> {
            return (minId == null) ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("accountId"), minId);
        };
    }

    public static Specification<Account> lessThanId(Integer maxId) {
        return (root, query, criteriaBuilder) -> {
            return (maxId == null) ? null : criteriaBuilder.lessThanOrEqualTo(root.get("accountId"), maxId);
        };
    }

    public static Specification<Account> searchByDepartmentName(String value) {

        return (root, query, criteriaBuilder) -> (value == null) ? null : criteriaBuilder.like(root.join("department").get("departmentName"), "%" + value + "%");
    }

    public static Specification<Account> minDate(LocalDateTime dateTime) {
        return (root, query, criteriaBuilder) -> (dateTime == null) ? null : criteriaBuilder.greaterThanOrEqualTo(root.get("createDate"), dateTime);
    }

    public static Specification<Account> minYear(Integer year) {
        return (root, query, criteriaBuilder)
                -> (year == null) ? null : criteriaBuilder.greaterThanOrEqualTo(
                criteriaBuilder.function("YEAR",Integer.class,root.get("createDate")), // YEAR(datetime) >= year
                year);
    }

    public static Specification<Account> equalPositionName(String positionName) {
        return (root, query, criteriaBuilder)
                -> (positionName == null) ? null : criteriaBuilder.equal(root.join("position").get("positionName"),positionName);
    }
}
