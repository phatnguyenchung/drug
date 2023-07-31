package com.example.drug.application.service;

import com.example.drug.application.port.in.loaithuoc.*;
import com.example.drug.application.port.out.loaithuoc.CreateLoaiThuoc;
import com.example.drug.application.port.out.loaithuoc.DeleteLoaiThuoc;
import com.example.drug.application.port.out.loaithuoc.UpdateLoaiThuoc;
import com.example.drug.common.UseCase;
import com.example.drug.domain.LoaiThuoc;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@RequiredArgsConstructor
public class LoaiThuocService implements CreateLoaiThuocUseCase, UpdateLoaiThuocUseCase, DeleteLoaiThuocUseCase {

    private final CreateLoaiThuoc createLoaiThuoc;
    private final UpdateLoaiThuoc updateLoaiThuoc;
    private final DeleteLoaiThuoc deleteLoaiThuoc;

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

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public UpdateLoaiThuocCommandResult updateLoaiThuoc(UpdateLoaiThuocCommand updateLoaiThuocCommand) {
        LoaiThuoc loaiThuoc = LoaiThuoc.builder()
                .stt(updateLoaiThuocCommand.getStt())
                .maloaithuoc(updateLoaiThuocCommand.getMaloaithuoc())
                .tentheobh(updateLoaiThuocCommand.getTentheobh())
                .sodangky(updateLoaiThuocCommand.getSodangky())
                .giatribaohiemchitra(updateLoaiThuocCommand.getGiatribaohiemchitra())
                .hoatchat(updateLoaiThuocCommand.getHoatchat())
                .mahoatchat(updateLoaiThuocCommand.getMahoatchat())
                .hamluong(updateLoaiThuocCommand.getHamluong())
                .duongdung(updateLoaiThuocCommand.getDuongdung())
                .lastend(updateLoaiThuocCommand.isLastend())
                .hangsanxuat(updateLoaiThuocCommand.getHangsanxuat())
                .nuocsanxuat(updateLoaiThuocCommand.getNuocsanxuat())
                .donvichinh(updateLoaiThuocCommand.getDonvichinh())
                .hotrilieu(updateLoaiThuocCommand.getHotrilieu())
                .build();
        updateLoaiThuoc.updateLoaiThuoc(loaiThuoc);
        return UpdateLoaiThuocCommandResult.builder().status(true).build();
    }

    @Override
    public DeleteLoaiThuocCommandResult deleteLoaiThuoc(Long stt) {
        deleteLoaiThuoc.deleteLoaiThuoc(stt);
        return DeleteLoaiThuocCommandResult.builder().status(true).build();
    }
}
