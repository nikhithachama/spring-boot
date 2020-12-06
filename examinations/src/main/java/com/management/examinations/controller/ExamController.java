package com.management.examinations.controller;

import com.management.examinations.dto.ExamSubject;
import com.management.examinations.model.Exam;
import com.management.examinations.repository.ExamRepositoryInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;


@Controller
public class ExamController {
    @Autowired
    private ExamRepositoryInf examRepositoryInf;
    @RequestMapping("/addExam")
    public String addExam() {

        return "examForm";
    }
    @PostMapping("/saveExam")
    public String saveExam(Exam exam) {
        examRepositoryInf.save(exam);
        return "home";
    }
    @GetMapping("/getJoinExamSubject")
    public List<ExamSubject> getJoinExamSubject(){
        return examRepositoryInf.getJoinExamSubject();
    }
}


