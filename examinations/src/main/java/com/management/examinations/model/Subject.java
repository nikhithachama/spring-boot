package com.management.examinations.model;

import javax.persistence.*;

@Entity
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int subId;
    private String subjectName;
    private String subjectCode;

    @ManyToOne
    private Exam exam;
    @ManyToOne
    private ClassName className;

    public Subject() {
    }

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    public Exam getExam() {
        return exam;
    }

    public void setExam(Exam exam) {
        this.exam = exam;
    }

    public int getSubId() {
        return subId;
    }

    public void setSubId(int subId) {
        this.subId = subId;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subId=" + subId +
                ", subjectName='" + subjectName + '\'' +
                ", subjectCode='" + subjectCode + '\'' +
                '}';
    }
}
