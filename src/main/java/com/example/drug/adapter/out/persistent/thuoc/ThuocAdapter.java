package com.example.drug.adapter.out.persistent.thuoc;

import com.example.drug.application.port.out.thuoc.CreateThuoc;
import com.example.drug.application.port.out.thuoc.UpdateThuoc;
import com.example.drug.common.PersistenceAdapter;
import com.example.drug.domain.Thuoc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class ThuocAdapter implements CreateThuoc, UpdateThuoc {
    private final ThuocJpaRepository repository;

    @Override
    public Thuoc save(Thuoc thuoc) {
        ThuocJpaEntity entity = repository.save(ThuocMapper.mapToJpaEntity(thuoc));
        return ThuocMapper.mapToDomainEntity(entity);
    }

    @Override
    public void updateThuoc(Thuoc thuoc) {
        Optional<ThuocJpaEntity> entity = repository.findById(thuoc.getStt());
        entity.ifPresent(record -> {
            ThuocMapper.mapToExistedJpaEntity(thuoc, record);
            repository.save(record);
        });
    }
}
