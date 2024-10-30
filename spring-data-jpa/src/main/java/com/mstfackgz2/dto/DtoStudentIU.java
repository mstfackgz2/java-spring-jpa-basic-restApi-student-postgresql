package com.mstfackgz2.dto;

import java.sql.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	
	private String firstName;

	private String lastName;

	private Date birthOfDate;
}
