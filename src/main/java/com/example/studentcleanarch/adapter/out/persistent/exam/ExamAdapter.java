package com.example.studentcleanarch.adapter.out.persistent.exam;

import com.example.studentcleanarch.application.port.out.exam.*;
import com.example.studentcleanarch.common.PersistenceAdapter;
import com.example.studentcleanarch.common.TimoException;
import com.example.studentcleanarch.domain.Exam;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class ExamAdapter implements CreateExam, UpdateExam, DeleteExam, SortExam, SearchExam {

    private final ExamJpaRepository examJpaRepository;

    @Override
    public Exam saveExam(Exam exam) {
        ExamJpaEntity examJpaEntity = examJpaRepository.save(ExamMapper.mapToJpaEntity(exam));
        return ExamMapper.mapToDomainEntity(examJpaEntity);
    }

    @Override
    public void updateExam(Exam exam) {
        Optional<ExamJpaEntity> entity = examJpaRepository.findById(exam.getId());
        entity.ifPresent(record -> {
            ExamMapper.mapToExistedJpaEntity(exam, record);
            examJpaRepository.save(record);
        });
    }

    @Override
    public void deleteExam(Long id) {
        boolean existById = examJpaRepository.existsById(id);
        if (!existById) {
            examJpaRepository.findById(id)
                    .map(ExamMapper::mapToDomainEntity)
                    .orElseThrow(() -> new TimoException(404, "Exam not found id:" + id));
        } else {
            examJpaRepository.deleteById(id);
        }
    }

    @Override
    public List<ExamJpaEntity> sortExamByDateDesc() {
        return examJpaRepository.findAll(Sort.by(Sort.Direction.DESC, "examDate"));
    }

    @Override
    public List<ExamJpaEntity> sortExamByDateAsc() {
        return examJpaRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION, "examDate"));
    }

    @Override
    public List<ExamJpaEntity> sortExamByScoreDesc() {
        return examJpaRepository.findAll(Sort.by(Sort.Direction.DESC, "score"));
    }

    @Override
    public List<ExamJpaEntity> sortExamByScoreAsc() {
        return examJpaRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION, "score"));
    }

    @Override
    public List<ExamJpaEntity> sortExamByStudentIdDesc() {
        return examJpaRepository.findAll(Sort.by(Sort.Direction.DESC, "studentId"));
    }

    @Override
    public List<ExamJpaEntity> sortExamByStudentIdAsc() {
        return examJpaRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION, "studentId"));
    }

    @Override
    public List<ExamJpaEntity> sortExamBySubjectIdDesc() {
        return examJpaRepository.findAll(Sort.by(Sort.Direction.DESC, "subjectId"));
    }

    @Override
    public List<ExamJpaEntity> sortExamBySubjectIdAsc() {
        return examJpaRepository.findAll(Sort.by(Sort.DEFAULT_DIRECTION, "subjectId"));
    }

    @Override
    public List<Exam> searchExamByStudentId(Long studentId) {
        try {
            List<ExamJpaEntity> examJpaEntityList = examJpaRepository.findByStudentId(studentId);
            for (ExamJpaEntity entity : examJpaEntityList) {
                System.out.println(entity.getSubjectId());
            }
            return examJpaRepository.findByStudentId(studentId).stream()
                    .map(ExamMapper::mapToDomainEntity)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new TimoException(500, "Exam could not found by student id:" + studentId);
        }
    }

    @Override
    public List<Exam> searchExamBySubjectId(Long subjectId) {
        try {
            List<ExamJpaEntity> examJpaEntityList = examJpaRepository.findBySubjectId(subjectId);
            for (ExamJpaEntity entity : examJpaEntityList) {
                System.out.println(entity.getSubjectId());
            }
            return examJpaRepository.findBySubjectId(subjectId).stream()
                    .map(ExamMapper::mapToDomainEntity)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new TimoException(500, "Exam could not found by subject id:" + subjectId);
        }
    }
}
