package com.muhammet.uber.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class SoforSaveRequestDto {
    String ad;
    String soyad;
    String adres;
    String telefon;
}
