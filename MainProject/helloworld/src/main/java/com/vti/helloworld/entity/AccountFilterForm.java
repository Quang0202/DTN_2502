package com.vti.helloworld.entity;

import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountFilterForm {

	private Integer minId;

	private Integer maxId;

	private Integer minYear;

	private String positionName;

}

