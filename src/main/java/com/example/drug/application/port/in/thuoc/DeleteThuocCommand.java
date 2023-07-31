package com.example.drug.application.port.in.thuoc;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class DeleteThuocCommand {
    @NotBlank
    private Long stt;
}
