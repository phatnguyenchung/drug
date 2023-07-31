package com.example.drug.adapter.out.persistent.thuoc;

import com.example.drug.application.port.out.thuoc.CreateThuoc;
import com.example.drug.common.PersistenceAdapter;
import com.example.drug.domain.Thuoc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class ThuocAdapter implements CreateThuoc {
    private final ThuocJpaRepository repository;

    @Override
    public Thuoc save(Thuoc thuoc) {
        ThuocJpaEntity entity = repository.save(ThuocMapper.mapToJpaEntity(thuoc));
        return ThuocMapper.mapToDomainEntity(entity);
    }
}
