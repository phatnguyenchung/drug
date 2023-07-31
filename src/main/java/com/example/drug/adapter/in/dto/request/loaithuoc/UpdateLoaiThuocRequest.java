package com.example.drug.adapter.in.dto.request.loaithuoc;

import com.example.drug.application.port.in.loaithuoc.UpdateLoaiThuocCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateLoaiThuocRequest {
    private Long stt;
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

    public UpdateLoaiThuocCommand toCommand() {
        return UpdateLoaiThuocCommand.builder()
                .stt(stt)
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
