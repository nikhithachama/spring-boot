package com.management.examinations.service;

import com.management.examinations.model.Subject;
import com.management.examinations.repository.SubjectRepositoryInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SubjectService  {
    @Autowired
    private SubjectRepositoryInf subjectRepositoryInf;

    public List<Subject> getAllBySubjectName(){
        return subjectRepositoryInf.findAll();

    }

}
