package com.example.drug.application.port.out.thuoc;

import com.example.drug.domain.Thuoc;
import org.springframework.stereotype.Component;

@Component
public interface UpdateThuoc {
    void updateThuoc(Thuoc thuoc);
}
