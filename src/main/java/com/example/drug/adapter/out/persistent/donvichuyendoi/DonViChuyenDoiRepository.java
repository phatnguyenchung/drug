package com.example.drug.adapter.out.persistent.donvichuyendoi;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface DonViChuyenDoiRepository extends JpaRepository<DonViChuyenDoiJpaEntity, Long>, JpaSpecificationExecutor<DonViChuyenDoiJpaEntity> {
}
