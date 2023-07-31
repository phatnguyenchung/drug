package com.example.drug.adapter.in.dto.request.thuoc;

import com.example.drug.application.port.in.thuoc.UpdateThuocCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class UpdateThuocRequest {
    private Long stt;
    private String ma;
    private String tendonvithuoc;
    private String mota;
    private String ghichu;

    public UpdateThuocCommand toCommand() {
        return UpdateThuocCommand.builder()
                .stt(stt)
                .ma(ma)
                .tendonvithuoc(tendonvithuoc)
                .mota(mota)
                .ghichu(ghichu)
                .build();
    }
}
