package com.example.drug.application.port.in.donvichuyendoi;

import lombok.Builder;
import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
@Builder
public class DeleteDonViChuyenDoiCommand {
    @NotBlank
    private Long stt;
}
