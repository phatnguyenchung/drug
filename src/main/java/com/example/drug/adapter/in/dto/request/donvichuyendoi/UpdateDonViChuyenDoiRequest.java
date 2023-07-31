package com.example.drug.adapter.in.dto.request.donvichuyendoi;

import com.example.drug.application.port.in.donvichuyendoi.UpdateDonViChuyenDoiCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateDonViChuyenDoiRequest {
    private Long stt;
    private String maloaithuoc;
    private String donvichinh;
    private String donvichuyendoi;
    private String tiledonvichinh;
    private String pheptinh;
    private String mota;
    private String ghichu;

    public UpdateDonViChuyenDoiCommand toCommand() {
        return UpdateDonViChuyenDoiCommand.builder()
                .stt(stt)
                .maloaithuoc(maloaithuoc)
                .donvichinh(donvichinh)
                .donvichuyendoi(donvichuyendoi)
                .tiledonvichinh(tiledonvichinh)
                .pheptinh(pheptinh)
                .mota(mota)
                .ghichu(ghichu)
                .build();
    }
}
