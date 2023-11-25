package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.studentRepo;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class studentServiceImpl implements studentService{
	
	private studentRepo repo;

	@Override
	public Student createStudent(Student student) {
		// TODO Auto-generated method stub
		return repo.save(student);
	}

}
