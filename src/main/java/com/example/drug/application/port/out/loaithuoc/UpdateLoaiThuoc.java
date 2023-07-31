package com.example.drug.application.port.out.loaithuoc;

import com.example.drug.domain.LoaiThuoc;
import org.springframework.stereotype.Component;

@Component
public interface UpdateLoaiThuoc {
    void updateLoaiThuoc(LoaiThuoc loaiThuoc);
}
