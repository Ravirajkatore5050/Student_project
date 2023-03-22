package com.sts.StudentController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sts.StudentModel.Student;
import com.sts.StudentService.StudentServiceInterface;

@RestController
public class StudentController {
	
	@Autowired
	public StudentServiceInterface ssi;
	
	@PostMapping("student")
	public Student savestudent(@RequestBody Student student) {
		return ssi.saveinsarviceinterface(student);
	}
	
}
