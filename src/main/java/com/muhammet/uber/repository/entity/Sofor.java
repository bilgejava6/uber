package com.muhammet.uber.repository.entity;

import lombok.*;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblsofor")
public class Sofor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String ad;
    String soyad;
    String adres;
    String telefon;
    Long puan;

}
