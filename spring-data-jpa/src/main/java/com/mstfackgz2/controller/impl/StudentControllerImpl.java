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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mstfackgz2.controller.IStudentController;
import com.mstfackgz2.entity.Student;
import com.mstfackgz2.services.IStudentService;


@RestController
@RequestMapping(path = "/api/student")
public class StudentControllerImpl implements IStudentController {
	
	@Autowired
	private IStudentService studentService;
	
	
	@PostMapping(path = "/save")
	@Override
	public Student saveStudent(@RequestBody Student student) {

		return studentService.saveStudent(student);
	}

	@GetMapping(path = "/get-all")
	@Override
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}

	@GetMapping(path = "/get/{id}")
	@Override
	public Student getStudentById(@PathVariable(name = "id",required = true) Integer id) {
		return studentService.getStudentById(id);
	}

	@DeleteMapping(path = "/delete/{id}")
	@Override
	public void deleteStudent(@PathVariable(name = "id") Integer id) {
		studentService.deleteStudent(id);
		
	}

	@PutMapping(path = "/update/{id}")
	@Override
	public Student updateStudent(@PathVariable(name = "id")Integer id,
								@RequestBody Student updatedStudent) {
		return studentService.updateStudent(id, updatedStudent);
	}
	
	
	

}
