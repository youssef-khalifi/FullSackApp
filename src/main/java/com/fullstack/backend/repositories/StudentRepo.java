package com.fullstack.backend.repositories;

import com.fullstack.backend.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student , Long> {

}
