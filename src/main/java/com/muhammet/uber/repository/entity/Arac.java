package com.muhammet.uber.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblarac")
public class Arac {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String plaka;
    AracTuru aracturu;
    Long soforid;
    Double fiyat;
    KiralamaDurum durum;
    Double lat;
    Double lon;
    String konum;
}
