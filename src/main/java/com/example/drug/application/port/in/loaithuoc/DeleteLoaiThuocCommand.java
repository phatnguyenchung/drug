package com.example.drug.application.port.in.loaithuoc;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class DeleteLoaiThuocCommand {
    @NotBlank
    private Long stt;
}
