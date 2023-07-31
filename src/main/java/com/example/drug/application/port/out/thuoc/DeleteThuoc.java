package com.example.drug.application.port.out.thuoc;

import org.springframework.stereotype.Component;

@Component
public interface DeleteThuoc {
    void deleteThoc(Long stt);
}
