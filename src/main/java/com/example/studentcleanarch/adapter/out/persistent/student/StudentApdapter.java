package com.example.studentcleanarch.adapter.out.persistent.student;

import com.example.studentcleanarch.application.port.out.*;
import com.example.studentcleanarch.common.PersistenceAdapter;
import com.example.studentcleanarch.domain.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class StudentApdapter implements CreateStudent, UpdateStudent, GetStudent, DeleteStudent, SearchStudent {

    private final StudentJpaRepository studentJpaRepository;

    @Override
    public Student saveStudent(Student student) {
        StudentJpaEntity studentJpaEntity = studentJpaRepository.save(StudentMapper.mapToJpaEntity(student));
        return StudentMapper.mapToDomainEntity(studentJpaEntity);
    }

    @Override
    public void updateStudent(Student student) {
        Optional<StudentJpaEntity> entity = studentJpaRepository.findById(student.getId());
        entity.ifPresent(record -> {
            StudentMapper.mapToExistedJpaEntity(student, record);
            studentJpaRepository.save(record);
        });
    }

    @Override
    public List<Student> getAllStudent() {
        try{
            List<StudentJpaEntity> studentJpaEntityList = studentJpaRepository.findAll();
            for(StudentJpaEntity entity : studentJpaEntityList){
                System.out.println(entity.getStudentId());
            }
            return studentJpaRepository.findAll().stream()
                    .map(StudentMapper::mapToDomainEntity)
                    .collect(Collectors.toList());
        }catch (Exception e){
            throw new RuntimeException(new Exception());
        }
    }

    @Override
    public Student getStudentById(long id) {
        return studentJpaRepository.findById(id)
                .map(StudentMapper::mapToDomainEntity)
                .orElseThrow();
    }

    @Override
    public void deleteStudent(Long id) {
        boolean existById = studentJpaRepository.existsById(id);
        if(!existById){
            System.out.print("Student is not exist for given id");
        }else{
            studentJpaRepository.deleteById(id);
        }
    }

    @Override
    public Student searchStudentByName(String studentName) {
        return studentJpaRepository.findByStudentName(studentName)
                .map(StudentMapper::mapToDomainEntity)
                .orElseThrow();
    }

    @Override
    public Student searchStudentByPhoneNumber(Long phoneNumber) {
        return studentJpaRepository.findByPhoneNumber(phoneNumber)
                .map(StudentMapper::mapToDomainEntity)
                .orElseThrow();
    }
}
