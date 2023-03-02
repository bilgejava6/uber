package com.muhammet.uber.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblkiralama")
public class Kiralama {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long musteriid;
    Long aracid;
    Long soforid;
    Long kiralamatarihi;
    Long onaytarihi;
    Long iptaltarihi;
    Double startlat;
    Double startlon;
    String startkonum;
    KiralamaDurum durum;
    /**
     * Müşteri Şoförü Puanlar
     */
    Long soforpuan;
    /**
     * Şoför Müşteriyi Puanlar
     */
    Long musteripuan;
    Double endlat;
    Double endlon;
    Double endkonum;
}
