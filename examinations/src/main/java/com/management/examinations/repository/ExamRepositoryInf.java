package com.management.examinations.repository;

import com.management.examinations.dto.ExamSubject;
import com.management.examinations.model.Exam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExamRepositoryInf extends JpaRepository<Exam,Integer> {
    @Query("SELECT new com.management.examinations.dto.ExamSubject(e.examType, s.subjectName)" +
            " FROM Exam e JOIN e.subjects s")
    public List<ExamSubject> getJoinExamSubject();
}
