package com.example.drug.adapter.out.persistent.thuoc;

import com.example.drug.domain.Thuoc;

public class ThuocMapper {

    public static ThuocJpaEntity mapToJpaEntity(Thuoc thuoc) {
        return ThuocJpaEntity.builder()
                .stt(thuoc.getStt())
                .ma(thuoc.getMa())
                .tendonvithuoc(thuoc.getTendonvithuoc())
                .mota(thuoc.getMota())
                .ghichu(thuoc.getGhichu())
                .build();
    }

    public static Thuoc mapToDomainEntity(ThuocJpaEntity entity) {
        return Thuoc.builder()
                .stt(entity.getStt())
                .ma(entity.getMa())
                .tendonvithuoc(entity.getTendonvithuoc())
                .mota(entity.getMota())
                .ghichu(entity.getGhichu())
                .build();
    }

    public static ThuocJpaEntity mapToExistedJpaEntity(Thuoc thuoc, ThuocJpaEntity entity) {
        entity.setStt(thuoc.getStt());
        entity.setMa(thuoc.getMa());
        entity.setTendonvithuoc(thuoc.getTendonvithuoc());
        entity.setMota(thuoc.getMota());
        entity.setGhichu(thuoc.getGhichu());
        return entity;
    }
}
