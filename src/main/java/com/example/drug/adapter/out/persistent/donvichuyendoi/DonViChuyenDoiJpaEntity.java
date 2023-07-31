package com.example.drug.adapter.out.persistent.donvichuyendoi;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "DonViChuyenDoi")
@Table(name = "donvichuyendoi")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class DonViChuyenDoiJpaEntity {
    @Id
    @Column(name = "stt")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stt;

    @Column(name = "maloaithuoc")
    private String maloaithuoc;

    @Column(name = "donvichinh")
    private String donvichinh;

    @Column(name = "donvichuyendoi")
    private String donvichuyendoi;

    @Column(name = "tiledonvitinh")
    private String tiledonvichinh;

    @Column(name = "pheptinh")
    private String pheptinh;

    @Column(name = "mota")
    private String mota;

    @Column(name = "ghichu")
    private String ghichu;
}
