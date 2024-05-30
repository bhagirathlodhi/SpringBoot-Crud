package com.student.student.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.student.student.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
