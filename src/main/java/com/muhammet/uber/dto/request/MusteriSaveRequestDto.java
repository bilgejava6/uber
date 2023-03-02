package com.muhammet.uber.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class MusteriSaveRequestDto {
    String ad;
    String soyad;
    String username;
    String password;
    String telefon;
}
