package com.example.drug.application.port.in.thuoc;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class DeleteThuocCommandResult {
    private boolean status;
}
