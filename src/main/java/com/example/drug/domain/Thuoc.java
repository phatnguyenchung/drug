package com.example.drug.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class Thuoc {
    private Long stt;
    private String ma;
    private String tendonvithuoc;
    private String mota;
    private String ghichu;
}
