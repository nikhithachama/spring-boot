package com.management.examinations.controller;

import com.management.examinations.model.*;
import com.management.examinations.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class StudentController {
    @Autowired
    private StudentRepositoryInf studentRepositoryInf;

    @RequestMapping("/")
    public String home() {

        return "home";
    }
    @RequestMapping("/addStudent")
    public String addStudent() {
        return "studentForm";
    }


    @PostMapping("/saveStudent" )
    public String saveStudent(Student student) {
        studentRepositoryInf.save(student);
        return "home";
    }
    @GetMapping("/studentList")
    public ModelAndView listOfStudents(ModelAndView modelAndView) {
        List<Student> students = studentRepositoryInf.findAll();
        modelAndView.addObject("listOfStudents", students);
        modelAndView.setViewName("display");
        return modelAndView;

    }

//    @GetMapping("/studentList")
//    public List<Student> getStudentsByClassName(Integer classNameId){
//        List<Student> studentsByClass = studentRepositoryInf.getStudentsByClassName(1);
//        for (Student stu: studentsByClass) {
//            System.out.println(stu);
//
//        }
//        return studentsByClass;
//    }

    
}
