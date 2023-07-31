package com.example.drug.application.port.in.loaithuoc;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class UpdateLoaiThuocCommand {
    @NotBlank
    private Long stt;
    @NotBlank
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
}
