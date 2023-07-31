package com.example.drug.adapter.out.persistent.loaithuoc;

import com.example.drug.application.port.out.loaithuoc.CreateLoaiThuoc;
import com.example.drug.common.PersistenceAdapter;
import com.example.drug.domain.LoaiThuoc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class LoaiThuocAdapter implements CreateLoaiThuoc {
    private final LoaiThuocJpaRepository repository;

    @Override
    public LoaiThuoc saveLoaiThuoc(LoaiThuoc loaiThuoc) {
        LoaiThuocJpaEntity loaiThuocJpaEntity = repository.save(LoaiThuocMapper.mapToJpaEntity(loaiThuoc));
        return LoaiThuocMapper.mapToDomainEntity(loaiThuocJpaEntity);
    }
}
