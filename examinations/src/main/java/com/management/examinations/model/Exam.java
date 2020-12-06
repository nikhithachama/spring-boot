package com.management.examinations.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Exam {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;
    private String examType;
    private String examCode;

    public Exam() {
    }

    @ManyToOne
    private ClassName className;

    public ClassName getClassName() {
        return className;
    }

    public void setClassName(ClassName className) {
        this.className = className;
    }

    @OneToMany(cascade = CascadeType.ALL,targetEntity =Subject.class, mappedBy = "exam")
    private List<Subject> subjects;

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getExamType() {
        return examType;
    }

    public String getExamCode() {
        return examCode;
    }

    public void setExamCode(String examCode) {
        this.examCode = examCode;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "eid=" + eid +
                ", examType='" + examType + '\'' +
                ", examCode='" + examCode + '\'' +
                '}';
    }

    public void setExamType(String examType) {
        this.examType = examType;
    }
}
