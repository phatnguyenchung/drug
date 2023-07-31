package com.example.drug.application.service;

import com.example.drug.application.port.in.loaithuoc.CreateLoaiThuocCommand;
import com.example.drug.application.port.in.loaithuoc.CreateLoaiThuocCommandResult;
import com.example.drug.application.port.in.loaithuoc.CreateLoaiThuocUseCase;
import com.example.drug.application.port.out.loaithuoc.CreateLoaiThuoc;
import com.example.drug.common.UseCase;
import com.example.drug.domain.LoaiThuoc;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@RequiredArgsConstructor
public class LoaiThuocService implements CreateLoaiThuocUseCase {

    private final CreateLoaiThuoc createLoaiThuoc;

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public CreateLoaiThuocCommandResult createLoaiThuoc(CreateLoaiThuocCommand createLoaiThuocCommand) {
        LoaiThuoc loaiThuoc = LoaiThuoc.builder()
                .maloaithuoc(createLoaiThuocCommand.getMaloaithuoc())
                .tentheobh(createLoaiThuocCommand.getTentheobh())
                .sodangky(createLoaiThuocCommand.getSodangky())
                .giatribaohiemchitra(createLoaiThuocCommand.getGiatribaohiemchitra())
                .hoatchat(createLoaiThuocCommand.getHoatchat())
                .mahoatchat(createLoaiThuocCommand.getMahoatchat())
                .hamluong(createLoaiThuocCommand.getHamluong())
                .duongdung(createLoaiThuocCommand.getDuongdung())
                .lastend(createLoaiThuocCommand.isLastend())
                .hangsanxuat(createLoaiThuocCommand.getHangsanxuat())
                .nuocsanxuat(createLoaiThuocCommand.getNuocsanxuat())
                .donvichinh(createLoaiThuocCommand.getDonvichinh())
                .hotrilieu(createLoaiThuocCommand.getHotrilieu())
                .build();
        createLoaiThuoc.saveLoaiThuoc(loaiThuoc);
        return CreateLoaiThuocCommandResult.builder().status(true).build();
    }
}
