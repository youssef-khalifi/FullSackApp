package com.fullstack.backend.repositories;

import com.fullstack.backend.entities.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityRepo extends JpaRepository<University , Long> {
}
