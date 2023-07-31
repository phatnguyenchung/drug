package com.example.drug.application.service;

import com.example.drug.application.port.in.donvichuyendoi.*;
import com.example.drug.application.port.out.donvichuyendoi.CreateDonViChuyenDoi;
import com.example.drug.application.port.out.donvichuyendoi.DeleteDonViChuyenDoi;
import com.example.drug.application.port.out.donvichuyendoi.UpdateDonViChuyenDoi;
import com.example.drug.common.UseCase;
import com.example.drug.domain.DonViChuyenDoi;
import lombok.RequiredArgsConstructor;

import javax.transaction.Transactional;

@UseCase
@RequiredArgsConstructor
public class DonViChuyenDoiService implements CreateDonViChuyenDoiUseCase, UpdateDonViChuyenDoiUseCase, DeleteDonViChuyenDoiUseCase {

    private final CreateDonViChuyenDoi createDonViChuyenDoi;
    private final UpdateDonViChuyenDoi updateDonViChuyenDoi;
    private final DeleteDonViChuyenDoi deleteDonViChuyenDoi;

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public CreateDonViChuyenDoiCommandResult createDonViChuyenDoi(CreateDonViChuyenDoiCommand command) {
        DonViChuyenDoi donViChuyenDoi = DonViChuyenDoi.builder()
                .maloaithuoc(command.getMaloaithuoc())
                .donvichinh(command.getDonvichinh())
                .donvichuyendoi(command.getDonvichuyendoi())
                .tiledonvichinh(command.getTiledonvichinh())
                .pheptinh(command.getPheptinh())
                .mota(command.getMota())
                .ghichu(command.getGhichu())
                .build();
        createDonViChuyenDoi.saveDonViChuyenDoi(donViChuyenDoi);
        return CreateDonViChuyenDoiCommandResult.builder().status(true).build();
    }

    @Override
    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public UpdateDonViChuyenDoiCommandResult updateDonViChuyenDoi(UpdateDonViChuyenDoiCommand updateDonViChuyenDoiCommand) {
        DonViChuyenDoi donViChuyenDoi = DonViChuyenDoi.builder()
                .stt(updateDonViChuyenDoiCommand.getStt())
                .maloaithuoc(updateDonViChuyenDoiCommand.getMaloaithuoc())
                .donvichinh(updateDonViChuyenDoiCommand.getDonvichinh())
                .tiledonvichinh(updateDonViChuyenDoiCommand.getTiledonvichinh())
                .pheptinh(updateDonViChuyenDoiCommand.getPheptinh())
                .mota(updateDonViChuyenDoiCommand.getMota())
                .ghichu(updateDonViChuyenDoiCommand.getGhichu())
                .build();
        updateDonViChuyenDoi.updateDonViChuyenDoi(donViChuyenDoi);
        return UpdateDonViChuyenDoiCommandResult.builder().status(true).build();
    }

    @Override
    public DeleteDonViChuyenDoiCommandResult deleteDonViChuyenDoi(DeleteDonViChuyenDoiCommand deleteDonViChuyenDoiCommand) {
        deleteDonViChuyenDoi.deleteDonViChuyenDoi(deleteDonViChuyenDoiCommand.getStt());
        return DeleteDonViChuyenDoiCommandResult.builder().status(true).build();
    }
}
