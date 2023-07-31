package com.example.drug.application.port.in.thuoc;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class UpdateThuocCommand {
    @NotBlank
    private Long stt;
    @NotBlank
    private String ma;
    private String tendonvithuoc;
    private String mota;
    private String ghichu;
}
