package com.example.drug.application.port.in.donvichuyendoi;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class CreateDonViChuyenDoiCommand {
    @NotBlank
    private String maloaithuoc;
    private String donvichinh;
    private String donvichuyendoi;
    private String tiledonvichinh;
    private String pheptinh;
    private String mota;
    private String ghichu;
}
