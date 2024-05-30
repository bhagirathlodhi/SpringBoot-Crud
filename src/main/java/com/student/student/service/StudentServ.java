package com.student.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.student.entity.Student;
import com.student.student.repo.StudentRepo;

@Service
public class StudentServ {
	
	@Autowired
	private StudentRepo strepo;
	
	public void save(Student student) {
		System.out.println(student);
		strepo.save(student);
			
		}
	
	public List<Student> getAllStudents(){
		return strepo.findAll();
		
	}



	public void deleteStudentById(int id) {
		strepo.deleteById(id);
		
	}
	
	public Student getStudentByid(int id) {
		return	strepo.findById(id).get();
		
	}

}
