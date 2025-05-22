package com.vti.helloworld.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AccountFilterForm {

	private Integer minId;

	private Integer maxId;

}

