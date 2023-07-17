package com.example.studentcleanarch.application.port.out.exam;

import com.example.studentcleanarch.adapter.out.persistent.exam.ExamJpaEntity;

import java.util.List;

public interface SortExam {
    List<ExamJpaEntity> sortExamByDateDesc();

    List<ExamJpaEntity> sortExamByDateAsc();

    List<ExamJpaEntity> sortExamByScoreDesc();

    List<ExamJpaEntity> sortExamByScoreAsc();
}
