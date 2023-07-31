package com.example.drug.adapter.out.persistent.donvichuyendoi;

import com.example.drug.domain.DonViChuyenDoi;

public class DonViChuyenDoiMapper {

    public static DonViChuyenDoiJpaEntity mapToJpaEntity(DonViChuyenDoi donViChuyenDoi) {
        return DonViChuyenDoiJpaEntity.builder()
                .stt(donViChuyenDoi.getStt())
                .maloaithuoc(donViChuyenDoi.getMaloaithuoc())
                .donvichinh(donViChuyenDoi.getDonvichinh())
                .donvichuyendoi(donViChuyenDoi.getDonvichuyendoi())
                .tiledonvichinh(donViChuyenDoi.getTiledonvichinh())
                .pheptinh(donViChuyenDoi.getPheptinh())
                .mota(donViChuyenDoi.getMota())
                .ghichu(donViChuyenDoi.getGhichu())
                .build();
    }


    public static DonViChuyenDoi mapToDomainEntity(DonViChuyenDoiJpaEntity entity) {
        return DonViChuyenDoi.builder()
                .stt(entity.getStt())
                .maloaithuoc(entity.getMaloaithuoc())
                .donvichinh(entity.getDonvichinh())
                .tiledonvichinh(entity.getTiledonvichinh())
                .pheptinh(entity.getPheptinh())
                .mota(entity.getMota())
                .ghichu(entity.getGhichu())
                .build();
    }

    public static DonViChuyenDoiJpaEntity mapToExistedJpaEntity(DonViChuyenDoi donViChuyenDoi, DonViChuyenDoiJpaEntity entity) {
        entity.setStt(donViChuyenDoi.getStt());
        entity.setMaloaithuoc(donViChuyenDoi.getMaloaithuoc());
        entity.setDonvichinh(donViChuyenDoi.getDonvichinh());
        entity.setTiledonvichinh(donViChuyenDoi.getTiledonvichinh());
        entity.setPheptinh(donViChuyenDoi.getPheptinh());
        entity.setMota(donViChuyenDoi.getMota());
        entity.setGhichu(donViChuyenDoi.getGhichu());
        return entity;
    }
}
