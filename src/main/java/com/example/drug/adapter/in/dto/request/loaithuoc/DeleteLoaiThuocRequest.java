package com.example.drug.adapter.in.dto.request.loaithuoc;

import com.example.drug.application.port.in.loaithuoc.DeleteLoaiThuocCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class DeleteLoaiThuocRequest {
    private Long stt;

    public DeleteLoaiThuocCommand toCommand() {
        return DeleteLoaiThuocCommand.builder()
                .stt(stt)
                .build();
    }
}
