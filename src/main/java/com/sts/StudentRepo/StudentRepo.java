package com.sts.StudentRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sts.StudentModel.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
