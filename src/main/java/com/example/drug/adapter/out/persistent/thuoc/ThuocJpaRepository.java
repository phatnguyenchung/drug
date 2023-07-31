package com.example.drug.adapter.out.persistent.thuoc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ThuocJpaRepository extends JpaRepository<ThuocJpaEntity, Long>, JpaSpecificationExecutor<ThuocJpaEntity> {
}
