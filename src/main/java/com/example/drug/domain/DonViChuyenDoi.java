package com.example.drug.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class DonViChuyenDoi {
    private Long stt;
    private String maloaithuoc;
    private String donvichinh;
    private String donvichuyendoi;
    private String tiledonvichinh;
    private String pheptinh;
    private String mota;
    private String ghichu;
}
