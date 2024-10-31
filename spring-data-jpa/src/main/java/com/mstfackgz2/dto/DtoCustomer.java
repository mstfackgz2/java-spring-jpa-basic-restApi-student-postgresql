package com.mstfackgz2.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoCustomer {

	private Long id;
	
	private String name;
	
	private DtoAdress adress;
}
