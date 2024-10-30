package com.mstfackgz2.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.mstfackgz2.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{

	//örnek query kullanımı
	
	//nativeQuery = false ise hql kullanmalısın java icindeki sınıflandırma isimleri gibi olmalı
	
	//nativeQuery = true ise sql kullanmalıısn sql tablosundaki isimlendirmeler gibi olmalı
	
	
	@Query(nativeQuery = false, value = "from Student")
	List<Student> findAllStudents();
	
	@Query(value = "from Student s WHERE s.id = :studentId",nativeQuery = false)
	Optional<Student> findStudentById(Integer studentId);
	


}
	
	
	
