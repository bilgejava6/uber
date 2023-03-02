package com.muhammet.uber.mapper;

import com.muhammet.uber.dto.request.SoforSaveRequestDto;
import com.muhammet.uber.repository.entity.Sofor;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ISoforMapper {
    ISoforMapper INSTANCE = Mappers.getMapper(ISoforMapper.class);

    Sofor toSofor(final SoforSaveRequestDto dto);
}
