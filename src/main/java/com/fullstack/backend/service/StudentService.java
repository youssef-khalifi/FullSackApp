package com.fullstack.backend.service;

import com.fullstack.backend.entities.Student;

import java.util.List;

public interface StudentService {

    Student save(Student student);
    Student update(Student student);
    void delete(Student student);
    long countStudents();
    List<Student> findAll(String filter);
}
