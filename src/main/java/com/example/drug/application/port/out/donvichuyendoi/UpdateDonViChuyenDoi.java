package com.example.drug.application.port.out.donvichuyendoi;

import com.example.drug.domain.DonViChuyenDoi;
import org.springframework.stereotype.Component;

@Component
public interface UpdateDonViChuyenDoi {
    void updateDonViChuyenDoi(DonViChuyenDoi donViChuyenDoi);
}
