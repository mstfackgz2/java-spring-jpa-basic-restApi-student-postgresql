package com.mstfackgz2.dto;

import java.sql.Date;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DtoStudentIU {
	@Size(min = 2,max = 14,message = "Name lenght must be 2-14")
	@NotEmpty(message = "This field cannot be empty")
	private String firstName;
	@Size(min = 2,max = 14,message = "LastName lenght must be 2-14")
	@NotEmpty(message = "This field cannot be empty")
	private String lastName;

	private Date birthOfDate;
}
