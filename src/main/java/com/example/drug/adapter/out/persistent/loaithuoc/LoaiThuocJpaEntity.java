package com.example.drug.adapter.out.persistent.loaithuoc;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "LoaiThuoc")
@Table(name = "loaithuoc")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class LoaiThuocJpaEntity {

    @Id
    @Column(name = "stt")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stt;

    @Column(name = "maloaithuoc")
    private String maloaithuoc;

    @Column(name = "tentheobh")
    private String tentheobh;

    @Column(name = "sodangky")
    private String sodangky;

    @Column(name = "giatribaohiemchitra")
    private String giatribaohiemchitra;

    @Column(name = "hoatchat")
    private String hoatchat;

    @Column(name = "mahoatchat")
    private String mahoatchat;

    @Column(name = "hamluong")
    private String hamluong;

    @Column(name = "duongdung")
    private String duongdung;

    @Column(name = "lastend")
    private boolean lastend;

    @Column(name = "hangsanxuat")
    private String hangsanxuat;

    @Column(name = "nuocsanxuat")
    private String nuocsanxuat;

    @Column(name = "donvichinh")
    private String donvichinh;

    @Column(name = "hotrilieu")
    private String hotrilieu;
}
