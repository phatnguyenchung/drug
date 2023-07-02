package com.example.studentcleanarch.adapter.out.persistent.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentJpaRepository extends JpaRepository<StudentJpaEntity, Long>, JpaSpecificationExecutor<StudentJpaEntity> {
    @Query(value = "SELECT * FROM tblStudent WHERE studentName LIKE %?1%",nativeQuery = true)
    List<StudentJpaEntity> findByStudentName(String studentName);

    @Query(value = "SELECT * FROM tblStudent WHERE phoneNumber LIKE %?1%",nativeQuery = true)
    Optional<StudentJpaEntity> findByPhoneNumber(Long phoneNumber);
}
