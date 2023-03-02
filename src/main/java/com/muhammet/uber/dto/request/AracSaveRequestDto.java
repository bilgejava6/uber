package com.muhammet.uber.dto.request;

import com.muhammet.uber.repository.entity.AracTuru;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AracSaveRequestDto {
    String plaka;
    AracTuru aracturu;
    Long soforid;
    Double fiyat;
}
