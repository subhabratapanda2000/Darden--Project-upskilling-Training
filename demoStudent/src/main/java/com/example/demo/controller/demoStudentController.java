package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.studentService;

import lombok.AllArgsConstructor;

@RestController	
@RequestMapping("/student")
@AllArgsConstructor
public class demoStudentController {
	
	private studentService service;
	
	@GetMapping("/response")
	public ResponseEntity<Student> getResponse() {
		Student st=new Student(1,"Samrat", 23, "jhghhh");
//		return new ResponseEntity<>(st,HttpStatus.OK );
		return ResponseEntity.ok().header("Custom-Header", "Samrat").body(st);
	}
	@PostMapping("/create")
	public ResponseEntity<Student> createStudent(@RequestBody Student student){
		Student st=service.createStudent(student);
		return ResponseEntity.ok(st);
	}

}
