package com.fullstack.backend.service.impl;

import com.fullstack.backend.entities.University;
import com.fullstack.backend.repositories.UniversityRepo;
import com.fullstack.backend.service.UniversityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UniversityServiceImpl implements UniversityService {

    private final UniversityRepo repo;
    @Override
    public University save(University university) {
        return this.repo.save(university);
    }

    @Override
    public University update(University university) {
        return this.repo.save(university);
    }

    @Override
    public void delete(University university) {
        this.repo.delete(university);
    }

    @Override
    public List<University> findAll() {
        return this.repo.findAll();
    }
}
