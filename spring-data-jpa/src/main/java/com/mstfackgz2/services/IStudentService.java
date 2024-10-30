package com.mstfackgz2.services;

import java.util.List;

import com.mstfackgz2.dto.DtoStudent;
import com.mstfackgz2.dto.DtoStudentIU;

public interface IStudentService {

	
	public DtoStudent saveStudent (DtoStudentIU dtoStudentIU);
	
	public List<DtoStudent> getAllStudents ();
	
	public DtoStudent getStudentById(Integer id);
	
	public void deleteStudent(Integer id);
	
	public DtoStudent updateStudent(Integer id, DtoStudentIU dtoStudentIU);
}
