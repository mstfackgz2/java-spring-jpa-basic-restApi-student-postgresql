package com.mstfackgz2.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mstfackgz2.entity.Student;
import com.mstfackgz2.repository.StudentRepository;
import com.mstfackgz2.services.IStudentService;

@Service
public class StudentServiceImpl implements IStudentService {

	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student getStudentById(Integer id) {
		Optional<Student> optional =  studentRepository.findById(id);
		if (optional.isPresent()) {
			return optional.get();
		}
		
		return null;
	}

	@Override
	public void deleteStudent(Integer id) {
		Student deletedStudent = getStudentById(id);
		if (deletedStudent != null) {
			studentRepository.delete(deletedStudent);
		}
		
		
	}

	@Override
	public Student updateStudent(Integer id, Student updatedStudent) {

		Student dbStudent = getStudentById(id);
		if (dbStudent != null) {
				dbStudent.setBirthOfDate(updatedStudent.getBirthOfDate());
				dbStudent.setFirstName(updatedStudent.getFirstName());
				dbStudent.setLastName(updatedStudent.getLastName());
				
				return studentRepository.save(dbStudent);
		}
		return null;
	}

}
