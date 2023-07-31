package com.example.drug.adapter.out.persistent.loaithuoc;

import com.example.drug.application.port.out.loaithuoc.CreateLoaiThuoc;
import com.example.drug.application.port.out.loaithuoc.UpdateLoaiThuoc;
import com.example.drug.common.PersistenceAdapter;
import com.example.drug.domain.LoaiThuoc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class LoaiThuocAdapter implements CreateLoaiThuoc, UpdateLoaiThuoc {
    private final LoaiThuocJpaRepository repository;

    @Override
    public LoaiThuoc saveLoaiThuoc(LoaiThuoc loaiThuoc) {
        LoaiThuocJpaEntity loaiThuocJpaEntity = repository.save(LoaiThuocMapper.mapToJpaEntity(loaiThuoc));
        return LoaiThuocMapper.mapToDomainEntity(loaiThuocJpaEntity);
    }

    @Override
    public void updateLoaiThuoc(LoaiThuoc loaiThuoc) {
        Optional<LoaiThuocJpaEntity> entity = repository.findById(loaiThuoc.getStt());
        entity.ifPresent(record -> {
            LoaiThuocMapper.mapToExistedJpaEntity(loaiThuoc, record);
            repository.save(record);
        });
    }
}
