package com.management.examinations.controller;

import com.management.examinations.model.Subject;
import com.management.examinations.repository.SubjectRepositoryInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SubjectController {

    @Autowired
    private SubjectRepositoryInf subjectRepositoryInf;

    @RequestMapping("/addSubject")
    public String addSubject() {

        return "subjectForm";
    }
    @PostMapping("/saveSubject")
    public String saveSubject(Subject subject) {
        subjectRepositoryInf.save(subject);
        return "home";
    }
}
