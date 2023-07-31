package com.example.drug.adapter.in.dto.request.loaithuoc;

import com.example.drug.application.port.in.loaithuoc.CreateLoaiThuocCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateLoaiThuocRequest {
    private String maloaithuoc;
    private String tentheobh;
    private String sodangky;
    private String giatribaohiemchitra;
    private String hoatchat;
    private String mahoatchat;
    private String hamluong;
    private String duongdung;
    private boolean lastend;
    private String hangsanxuat;
    private String nuocsanxuat;
    private String donvichinh;
    private String hotrilieu;

    public CreateLoaiThuocCommand toCommand() {
        return CreateLoaiThuocCommand.builder()
                .maloaithuoc(maloaithuoc)
                .tentheobh(tentheobh)
                .sodangky(sodangky)
                .giatribaohiemchitra(giatribaohiemchitra)
                .hoatchat(hoatchat)
                .mahoatchat(mahoatchat)
                .hamluong(hamluong)
                .duongdung(duongdung)
                .lastend(lastend)
                .hangsanxuat(hangsanxuat)
                .nuocsanxuat(nuocsanxuat)
                .donvichinh(donvichinh)
                .hotrilieu(hotrilieu)
                .build();
    }
}
