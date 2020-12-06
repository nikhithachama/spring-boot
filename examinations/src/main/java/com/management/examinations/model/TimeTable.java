package com.management.examinations.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;
import java.sql.Time;
@Entity
public class TimeTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String examType;
    private String subjectName;
    private Date examDate;
//    private Time startTime;
//    private Time endTime;

    public TimeTable() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getExamType() {
        return examType;
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Date getExamDate() {
        return examDate;
    }

    public void setExamDate(Date examDate) {
        this.examDate = examDate;
    }

//    public Time getStartTime() {
//        return startTime;
//    }
//
//    public void setStartTime(Time startTime) {
//        this.startTime = startTime;
//    }
//
//    public Time getEndTime() {
//        return endTime;
//    }
//
//    public void setEndTime(Time endTime) {
//        this.endTime = endTime;
//    }

    @Override
    public String toString() {
        return "TimeTable{" +
                "id=" + id +
                ", examType='" + examType + '\'' +
                ", name='" + name + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", examDate=" + examDate +
//                ", startTime=" + startTime +
//                ", endTime=" + endTime +
                '}';
    }
}
