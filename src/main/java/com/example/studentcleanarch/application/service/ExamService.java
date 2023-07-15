package com.example.studentcleanarch.application.service;

import com.example.studentcleanarch.application.port.in.exam.*;
import com.example.studentcleanarch.application.port.out.exam.CreateExam;
import com.example.studentcleanarch.application.port.out.exam.DeleteExam;
import com.example.studentcleanarch.application.port.out.exam.UpdateExam;
import com.example.studentcleanarch.common.UseCase;
import com.example.studentcleanarch.domain.Exam;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;
import java.time.Instant;
import java.util.Date;

@UseCase
@RequiredArgsConstructor
public class ExamService implements CreateExamUseCase, UpdateExamUseCase, DeleteExamUseCase {
    private final CreateExam createExam;
    private final UpdateExam updateExam;
    private final DeleteExam deleteExam;

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public CreateExamCommandResult createExam(CreateExamCommand createExamCommand) {
        Exam exam = Exam.builder()
                .studentId(createExamCommand.getStudentId())
                .subjectId(createExamCommand.getSubjectId())
                .examDate(createExamCommand.getExamDate())
                .score(createExamCommand.getScore())
                .build();
        if (createExamCommand.getScore() > 10 || createExamCommand.getScore() < 0) {
            return CreateExamCommandResult.builder().status(false).build();
        } else if (createExamCommand.getExamDate().after(Date.from(Instant.now()))) {
            return CreateExamCommandResult.builder().status(false).build();
        } else {
            createExam.saveExam(exam);
        }
        return CreateExamCommandResult.builder().status(true).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public UpdateExamCommandResult updateExam(UpdateExamCommand updateExamCommand) {
        Exam exam = Exam.builder()
                .id(updateExamCommand.getId())
                .studentId(updateExamCommand.getStudentId())
                .subjectId(updateExamCommand.getSubjectId())
                .examDate(updateExamCommand.getExamDate())
                .score(updateExamCommand.getScore())
                .build();
        if (updateExamCommand.getScore() > 10 || updateExamCommand.getScore() < 0) {
            return UpdateExamCommandResult.builder().status(false).build();
        } else if (updateExamCommand.getExamDate().after(Date.from(Instant.now()))) {
            return UpdateExamCommandResult.builder().status(false).build();
        } else {
            updateExam.updateExam(exam);
        }
        return UpdateExamCommandResult.builder().status(true).build();
    }

    @Override
    public DeleteExamCommandResult deleteExam(Long id) {
        deleteExam.deleteExam(id);
        return DeleteExamCommandResult.builder().status(true).build();
    }
}