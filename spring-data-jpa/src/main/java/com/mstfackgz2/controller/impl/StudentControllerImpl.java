package com.mstfackgz2.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mstfackgz2.controller.IStudentController;
import com.mstfackgz2.dto.DtoStudent;
import com.mstfackgz2.dto.DtoStudentIU;
import com.mstfackgz2.services.IStudentService;


@RestController
@RequestMapping(path = "/api/student")
public class StudentControllerImpl implements IStudentController {
	
	@Autowired
	private IStudentService studentService;
	
	
	@PostMapping(path = "/save")
	@Override
	public DtoStudent saveStudent(@RequestBody DtoStudentIU dtoStudentIU) {

		return studentService.saveStudent(dtoStudentIU);
	}

	@GetMapping(path = "/get-all")
	@Override
	public List<DtoStudent> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(path = "/get/{id}")
	@Override
	public DtoStudent getStudentById(@PathVariable(name = "id",required = true) Integer id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudent(id);
		
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public DtoStudent updateStudent(@PathVariable(name = "id")Integer id,
								@RequestBody  DtoStudentIU dtoStudentIU) {
		return studentService.updateStudent(id, dtoStudentIU);
	}
	
	
	

}
