package com.student.main.controller;



import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.student.main.model.Student;
import com.student.main.service.StudentService;

@RestController
public class StudentController {
	StudentService studentService;
	
	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}


@RequestMapping("/hello")
public String Hello() {
	return "hello world";
	
}

	@RequestMapping(value="student/{id}",method = RequestMethod.GET,produces = { "application/json", "application/xml" })
	@ResponseStatus(HttpStatus.OK)
	@ResponseBody	
	public Student getStudent(@PathVariable("id") String id) {
		
		Student student=studentService.getStudentdetails(id);
	
		return student;
		
	}

}
