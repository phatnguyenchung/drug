package com.example.drug.adapter.out.persistent.thuoc;

import com.example.drug.application.port.out.thuoc.CreateThuoc;
import com.example.drug.application.port.out.thuoc.DeleteThuoc;
import com.example.drug.application.port.out.thuoc.UpdateThuoc;
import com.example.drug.common.PersistenceAdapter;
import com.example.drug.common.TimoException;
import com.example.drug.domain.Thuoc;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class ThuocAdapter implements CreateThuoc, UpdateThuoc, DeleteThuoc {
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

    @Override
    public void deleteThoc(Long stt) {
        boolean existById = repository.existsById(stt);
        if (existById) {
            repository.deleteById(stt);
        } else {
            repository.findById(stt)
                    .map(ThuocMapper::mapToDomainEntity)
                    .orElseThrow(() -> new TimoException(404, "Thuoc not found stt:" + stt));
        }
    }
}
