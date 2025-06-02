package com.vti.QLNV.specification;

import com.vti.QLNV.entity.Account;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import org.springframework.data.jpa.domain.Specification;



public class AccountSpecification {
    public static Specification<Account> searchByUserName(String value){
//        return new Specification<Account>() {
//            @Override
//            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
//                if(value!= null){
//                    return criteriaBuilder.like(root.get("userName"),"%"+ value+"%");
//                }
//                return null;
//            }
//        };
        if(value != null) {
            return (root, query, criteriaBuilder) -> {
                return criteriaBuilder.like(root.get("userName"), "%" + value + "%");
            };
        }
        return null;
    }

    public static Specification<Account> greaterThanId(int minId){
        if(minId!= 0) {
            return (root, query, criteriaBuilder) -> {
                return criteriaBuilder.greaterThanOrEqualTo(root.get("accountId"), minId);
            };
        }
        return null;
    }

    public static Specification<Account> lessThanId(int maxId){
        if(maxId!= 0) {
            return (root, query, criteriaBuilder) -> {
                return criteriaBuilder.lessThanOrEqualTo(root.get("accountId"), maxId);
            };
        }
        return null;
    }
}
