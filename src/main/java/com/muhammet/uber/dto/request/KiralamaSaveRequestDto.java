package com.muhammet.uber.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class KiralamaSaveRequestDto {
    Long musteriid;
    Long aracid;
    Long soforid;
    Long kiralamatarihi;
    Double startlat;
    Double startlon;
    String startkonum;
}
