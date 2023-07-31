package com.example.drug.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class LoaiThuoc {
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
}
