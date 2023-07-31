package com.example.drug.adapter.out.persistent.loaithuoc;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface LoaiThuocJpaRepository extends JpaRepository<LoaiThuocJpaEntity, Long>, JpaSpecificationExecutor<LoaiThuocJpaEntity> {
}
