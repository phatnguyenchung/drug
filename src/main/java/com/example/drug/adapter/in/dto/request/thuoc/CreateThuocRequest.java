package com.example.drug.adapter.in.dto.request.thuoc;

import com.example.drug.application.port.in.thuoc.CreateThuocCommand;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateThuocRequest {
    private String ma;
    private String tendonvithuoc;
    private String mota;
    private String ghichu;

    public CreateThuocCommand toCommand() {
        return CreateThuocCommand.builder()
                .ma(ma)
                .tendonvithuoc(tendonvithuoc)
                .mota(mota)
                .ghichu(ghichu)
                .build();
    }
}
