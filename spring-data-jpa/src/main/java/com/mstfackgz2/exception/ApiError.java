package com.mstfackgz2.exception;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApiError<T> {
	
	private String id;
	
	private LocalDateTime errorTime;
	
	private T errors;

}
