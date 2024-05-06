package com.fullstack.backend.service;

import com.fullstack.backend.entities.Student;
import com.fullstack.backend.entities.University;

import java.util.List;

public interface UniversityService {

    University save(University university);
    University update(University university);
    void delete(University university);
    List<University> findAll();
}
