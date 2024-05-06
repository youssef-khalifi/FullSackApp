package com.fullstack.backend.repositories;

import com.fullstack.backend.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface StudentRepo extends JpaRepository<Student , Long> {

    @Query("select s from Student s " +
            "where lower(s.firstname) like lower(concat('%', :searchTerm, '%')) " +
            "or lower(s.lastname) like lower(concat('%', :searchTerm, '%'))")
    List<Student> search(@Param("searchTerm")String filter);
}
