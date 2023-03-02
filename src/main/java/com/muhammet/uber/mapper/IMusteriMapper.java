package com.muhammet.uber.mapper;

import com.muhammet.uber.dto.request.MusteriSaveRequestDto;
import com.muhammet.uber.repository.entity.Musteri;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IMusteriMapper {
    IMusteriMapper INSTANCE = Mappers.getMapper(IMusteriMapper.class);

    Musteri toMusteri(final MusteriSaveRequestDto dto);
}
