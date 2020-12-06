package com.management.examinations.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
@Entity
public class ExamTimeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int etId;
    private String examType;
    private String subjectName;
    private Date examDate;
    private Time startTime;
    private Time endTime;

    public ExamTimeTable() {
    }

    public ExamTimeTable(String examType, String subjectName, Date examDate, Time startTime, Time endTime) {
        this.examType = examType;
        this.subjectName = subjectName;
        this.examDate = examDate;
        this.startTime = startTime;
        this.endTime = endTime;
    }
}
