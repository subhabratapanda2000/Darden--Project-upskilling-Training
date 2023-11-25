package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Student;

public interface studentRepo extends JpaRepository<Student, Integer> {

    Optional<Student> findByEmail(String email);
}
