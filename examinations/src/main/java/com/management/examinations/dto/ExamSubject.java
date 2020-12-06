package com.management.examinations.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ExamSubject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int esId;
    private String examType;
    private String subjectName;

    public ExamSubject() {
    }

    public ExamSubject(String examType, String subjectName) {
        this.examType = examType;
        this.subjectName = subjectName;
    }
}
