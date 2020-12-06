package com.management.examinations.controller;

import com.management.examinations.model.ClassName;
import com.management.examinations.repository.ClassNameRepositoryInf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class ClassNameController {

    @Autowired
    private ClassNameRepositoryInf classNameRepositoryInf;

    @RequestMapping("/addClass")
    public String addClass() {

        return "classNameForm";
    }

    @PostMapping("/saveClass")
    public String saveClass(ClassName className) {
        classNameRepositoryInf.save(className);
        return "home";
    }
}

