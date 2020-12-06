package com.management.examinations.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class ClassName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String classCode;

    public ClassName() {
    }

    @OneToMany(cascade = CascadeType.ALL,targetEntity = Student.class, mappedBy = "className")
//    @JoinColumn(name = "cs_fk", referencedColumnName="id")
    private List<Student> students;

    @OneToMany(cascade = CascadeType.ALL,targetEntity = Exam.class, mappedBy = "className")
    private List<Exam> exams;

    @OneToMany(cascade = CascadeType.ALL,targetEntity = Subject.class, mappedBy = "className")
    private List<Subject> subjects;

    public List<Exam> getExams() {
        return exams;
    }

    public void setExams(List<Exam> exams) {
        this.exams = exams;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassCode() {
        return classCode;
    }

    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "ClassName{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classCode='" + classCode + '\'' +
                '}';
    }
}
