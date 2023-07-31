package com.example.drug.application.service;

import com.example.drug.application.port.in.thuoc.CreateThuocCommand;
import com.example.drug.application.port.in.thuoc.CreateThuocCommandResult;
import com.example.drug.application.port.in.thuoc.CreateThuocUseCase;
import com.example.drug.application.port.out.thuoc.CreateThuoc;
import com.example.drug.common.UseCase;
import com.example.drug.domain.Thuoc;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@RequiredArgsConstructor
public class ThuocService implements CreateThuocUseCase {

    private final CreateThuoc createThuoc;

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
}
