package com.example.drug.adapter.out.persistent.donvichuyendoi;

import com.example.drug.application.port.out.donvichuyendoi.CreateDonViChuyenDoi;
import com.example.drug.application.port.out.donvichuyendoi.DeleteDonViChuyenDoi;
import com.example.drug.application.port.out.donvichuyendoi.UpdateDonViChuyenDoi;
import com.example.drug.common.PersistenceAdapter;
import com.example.drug.common.TimoException;
import com.example.drug.domain.DonViChuyenDoi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@PersistenceAdapter
@RequiredArgsConstructor
@Service
public class DonViChuyenDoiAdapter implements CreateDonViChuyenDoi, UpdateDonViChuyenDoi, DeleteDonViChuyenDoi {

    private final DonViChuyenDoiRepository repository;

    @Override
    public DonViChuyenDoi saveDonViChuyenDoi(DonViChuyenDoi donViChuyenDoi) {
        DonViChuyenDoiJpaEntity entity = repository.save(DonViChuyenDoiMapper.mapToJpaEntity(donViChuyenDoi));
        return DonViChuyenDoiMapper.mapToDomainEntity(entity);
    }

    @Override
    public void updateDonViChuyenDoi(DonViChuyenDoi donViChuyenDoi) {
        Optional<DonViChuyenDoiJpaEntity> entity = repository.findById(donViChuyenDoi.getStt());
        entity.ifPresent(record -> {
            DonViChuyenDoiMapper.mapToExistedJpaEntity(donViChuyenDoi, record);
            repository.save(record);
        });
    }

    @Override
    public void deleteDonViChuyenDoi(Long stt) {
        boolean existById = repository.existsById(stt);
        if (existById) {
            repository.deleteById(stt);
        } else {
            repository.findById(stt)
                    .map(DonViChuyenDoiMapper::mapToDomainEntity)
                    .orElseThrow(() -> new TimoException(404, "Don vi chuyen doi not found stt:" + stt));
        }
    }
}
