package com.management.examinations.repository;

import com.management.examinations.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface StudentRepositoryInf extends JpaRepository<Student,Integer> {

    public List<Student> getStudentsByClassName(Integer classNameId);
}
