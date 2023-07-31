package com.example.drug.adapter.in.dto.request.donvichuyendoi;

import com.example.drug.application.port.in.donvichuyendoi.DeleteDonViChuyenDoiCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeleteDonViChuyenDoiRequest {
    private Long stt;

    public DeleteDonViChuyenDoiCommand toCommand() {
        return DeleteDonViChuyenDoiCommand.builder()
                .stt(stt)
                .build();
    }
}
