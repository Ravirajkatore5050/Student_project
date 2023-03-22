package com.sts.StudentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sts.StudentModel.Student;
import com.sts.StudentRepo.StudentRepo;

@Service
public class StudentService implements StudentServiceInterface{
	@Autowired
	public StudentRepo sr;
	@Override
	public Student saveinsarviceinterface(Student student) {
		// TODO Auto-generated method stub
		return sr.save(student);
	}

}
