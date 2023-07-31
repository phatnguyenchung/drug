package com.example.drug.adapter.in.dto.request.thuoc;

import com.example.drug.application.port.in.thuoc.DeleteThuocCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeleteThuocRequest {
    private Long stt;

    public DeleteThuocCommand toCommand() {
        return DeleteThuocCommand.builder()
                .stt(stt)
                .build();
    }
}
