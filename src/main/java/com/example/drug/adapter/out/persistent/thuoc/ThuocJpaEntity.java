package com.example.drug.adapter.out.persistent.thuoc;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "Thuoc")
@Table(name = "thuoc")
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class ThuocJpaEntity {

    @Id
    @Column(name = "stt")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long stt;

    private String ma;

    private String tendonvithuoc;

    private String mota;

    private String ghichu;
}
