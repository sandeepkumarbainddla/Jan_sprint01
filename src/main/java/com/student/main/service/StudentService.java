package com.student.main.service;

import org.springframework.stereotype.Service;

import com.student.main.model.Student;

import ch.qos.logback.classic.Logger;
import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class StudentService {
	
	public Student getStudentdetails(String id) {
//		String id=UUID.randomUUID().toString();
		System.out.println(id);
		
		Student student=new Student("someId","sandeep","4120-lexington plaza","Java");
		
		return student;
		
	}

}
