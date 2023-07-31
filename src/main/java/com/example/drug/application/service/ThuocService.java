package com.example.drug.application.service;

import com.example.drug.application.port.in.thuoc.*;
import com.example.drug.application.port.out.thuoc.CreateThuoc;
import com.example.drug.application.port.out.thuoc.UpdateThuoc;
import com.example.drug.common.UseCase;
import com.example.drug.domain.Thuoc;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@RequiredArgsConstructor
public class ThuocService implements CreateThuocUseCase, UpdateThuocUseCase {

    private final CreateThuoc createThuoc;
    private final UpdateThuoc updateThuoc;

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public CreateThuocCommandResult createThuoc(CreateThuocCommand createThuocCommand) {
        Thuoc thuoc = Thuoc.builder()
                .ma(createThuocCommand.getMa())
                .tendonvithuoc(createThuocCommand.getTendonvithuoc())
                .mota(createThuocCommand.getMota())
                .ghichu(createThuocCommand.getGhichu())
                .build();
        createThuoc.save(thuoc);
        return CreateThuocCommandResult.builder().status(true).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public UpdateThuocCommandResult updateThuoc(UpdateThuocCommand updateThuocCommand) {
        Thuoc thuoc = Thuoc.builder()
                .stt(updateThuocCommand.getStt())
                .ma(updateThuocCommand.getMa())
                .tendonvithuoc(updateThuocCommand.getTendonvithuoc())
                .mota(updateThuocCommand.getMota())
                .ghichu(updateThuocCommand.getGhichu())
                .build();
        updateThuoc.updateThuoc(thuoc);
        return UpdateThuocCommandResult.builder().status(true).build();
    }
}
