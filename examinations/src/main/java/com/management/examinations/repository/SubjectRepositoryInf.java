package com.management.examinations.repository;

import com.management.examinations.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SubjectRepositoryInf extends JpaRepository<Subject,Integer> {




}
