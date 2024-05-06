package com.fullstack.backend.service.impl;

import com.fullstack.backend.entities.Student;
import com.fullstack.backend.repositories.StudentRepo;
import com.fullstack.backend.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepo repo;
    @Override
    public Student save(Student student) {

        if (student == null){
            System.err.println("student is null!!");
            return null;
        }
        return this.repo.save(student);
    }

    @Override
    public Student update(Student student) {
        return this.repo.save(student);
    }

    @Override
    public void delete(Student student) {
        this.repo.delete(student);
    }

    @Override
    public long countStudents() {
        return this.repo.count();
    }

    @Override
    public List<Student> findAll(String filter) {

        if (filter.isEmpty()){
            return this.repo.findAll();
        }
        return this.repo.search(filter);
    }
}
