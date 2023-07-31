package com.example.drug.adapter.out.persistent.loaithuoc;

import com.example.drug.domain.LoaiThuoc;

public class LoaiThuocMapper {

    public static LoaiThuocJpaEntity mapToJpaEntity(LoaiThuoc loaiThuoc) {
        return LoaiThuocJpaEntity.builder()
                .stt(loaiThuoc.getStt())
                .maloaithuoc(loaiThuoc.getMaloaithuoc())
                .tentheobh(loaiThuoc.getTentheobh())
                .sodangky(loaiThuoc.getSodangky())
                .giatribaohiemchitra(loaiThuoc.getGiatribaohiemchitra())
                .hoatchat(loaiThuoc.getHoatchat())
                .mahoatchat(loaiThuoc.getMahoatchat())
                .hamluong(loaiThuoc.getHamluong())
                .duongdung(loaiThuoc.getDuongdung())
                .lastend(loaiThuoc.isLastend())
                .hangsanxuat(loaiThuoc.getHangsanxuat())
                .nuocsanxuat(loaiThuoc.getNuocsanxuat())
                .donvichinh(loaiThuoc.getDonvichinh())
                .hotrilieu(loaiThuoc.getHotrilieu())
                .build();
    }

    public static LoaiThuoc mapToDomainEntity(LoaiThuocJpaEntity entity) {
        return LoaiThuoc.builder()
                .stt(entity.getStt())
                .maloaithuoc(entity.getMaloaithuoc())
                .tentheobh(entity.getTentheobh())
                .sodangky(entity.getSodangky())
                .giatribaohiemchitra(entity.getGiatribaohiemchitra())
                .hoatchat(entity.getHoatchat())
                .mahoatchat(entity.getMahoatchat())
                .hamluong(entity.getHamluong())
                .duongdung(entity.getDuongdung())
                .lastend(entity.isLastend())
                .hangsanxuat(entity.getHangsanxuat())
                .nuocsanxuat(entity.getNuocsanxuat())
                .donvichinh(entity.getDonvichinh())
                .hotrilieu(entity.getHotrilieu())
                .build();
    }

    public static LoaiThuocJpaEntity mapToExistedJpaEntity(LoaiThuoc loaiThuoc, LoaiThuocJpaEntity entity) {
        entity.setStt(loaiThuoc.getStt());
        entity.setMaloaithuoc(loaiThuoc.getMaloaithuoc());
        entity.setTentheobh(loaiThuoc.getTentheobh());
        entity.setSodangky(loaiThuoc.getSodangky());
        entity.setGiatribaohiemchitra(loaiThuoc.getGiatribaohiemchitra());
        entity.setHoatchat(loaiThuoc.getHoatchat());
        entity.setMahoatchat(loaiThuoc.getMahoatchat());
        entity.setHamluong(loaiThuoc.getHamluong());
        entity.setDuongdung(loaiThuoc.getDuongdung());
        entity.setLastend(loaiThuoc.isLastend());
        entity.setHangsanxuat(loaiThuoc.getHangsanxuat());
        entity.setNuocsanxuat(loaiThuoc.getNuocsanxuat());
        entity.setDonvichinh(loaiThuoc.getDonvichinh());
        entity.setHotrilieu(entity.getHotrilieu());
        return entity;
    }
}
