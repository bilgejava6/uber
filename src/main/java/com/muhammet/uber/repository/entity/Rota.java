package com.muhammet.uber.repository.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "tblrota")
public class Rota {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long aracid;
    String rotaadi;


}
