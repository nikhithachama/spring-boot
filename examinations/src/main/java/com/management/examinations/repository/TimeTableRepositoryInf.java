package com.management.examinations.repository;

import com.management.examinations.dto.ExamSubject;
import com.management.examinations.model.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimeTableRepositoryInf extends JpaRepository<TimeTable,Integer> {


}
