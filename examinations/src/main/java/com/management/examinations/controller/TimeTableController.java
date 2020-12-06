package com.management.examinations.controller;

import com.management.examinations.model.Subject;
import com.management.examinations.model.TimeTable;
import com.management.examinations.repository.TimeTableRepositoryInf;
import com.management.examinations.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class TimeTableController {
    @Autowired
    private TimeTableRepositoryInf timeTableRepositoryInf;
    @Autowired
    private SubjectService subjectService;
    @RequestMapping("/addTimeTable")
    public String addTimeTable() {
        return "timeTableForm";
    }
    @PostMapping("/saveTimeTable")
    public String saveTimeTable(TimeTable timeTable) {
        timeTableRepositoryInf.save(timeTable);
        return "timeTableDisplay";
    }
    @GetMapping("/timeTableDisplay")
    public ModelAndView listOfTimeTables(ModelAndView modelAndView) {
        List<Subject> subjects = subjectService.getAllBySubjectName();
        List<TimeTable> timeTables = timeTableRepositoryInf.findAll();
        modelAndView.addObject("listOfSubjects", subjects);
        modelAndView.addObject("listOfTables", timeTables);
        modelAndView.setViewName("timeTabledisplay");
        return modelAndView;
    }
    //    @GetMapping("/timeTableDisplay")
//    public ModelAndView listOfSubjects(ModelAndView modelAndView) {
//        List<Subject> subjects = subjectService.getAllBySubjectName();
//        modelAndView.addObject("listOfSubjects", subjects);
//        modelAndView.setViewName("timeTabledisplay");
//        return modelAndView;
//    }
}
