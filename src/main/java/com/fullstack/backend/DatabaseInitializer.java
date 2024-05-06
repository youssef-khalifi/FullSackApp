package com.fullstack.backend;

import com.fullstack.backend.entities.Gender;
import com.fullstack.backend.entities.Student;
import com.fullstack.backend.entities.University;
import com.fullstack.backend.repositories.StudentRepo;
import com.fullstack.backend.repositories.UniversityRepo;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DatabaseInitializer {

    private final StudentRepo studentRepo;
    private final UniversityRepo universityRepo;

    @PostConstruct
    public void insert() {

        University u1 = new University();
        University u2 = new University();
        University u3 = new University();
        u1.setName("FPL");
        u2.setName("FST");
        u3.setName("ENSA");

        universityRepo.save(u1);universityRepo.save(u2);universityRepo.save(u3);

       Student s1 = new Student();
       Student s2 = new Student();
       Student s3 = new Student();

       s1.setFirstname("student1");
       s1.setLastname("student1");
       s1.setEmail("student1@gmail.com");
       s1.setGender(Gender.MALE);
       s1.setUniversity(u1);

       s2.setFirstname("student2");
       s2.setLastname("student2");
       s2.setEmail("student2@gmail.com");
       s2.setGender(Gender.FEMALE);
       s2.setUniversity(u2);

       s3.setFirstname("student3");
       s3.setLastname("student3");
       s3.setEmail("student3@gmail.com");
       s3.setGender(Gender.OTHER);
       s3.setUniversity(u3);

       studentRepo.save(s1);studentRepo.save(s2);studentRepo.save(s3);

    }
}
