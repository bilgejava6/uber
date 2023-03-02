package com.muhammet.uber.service;

import com.muhammet.uber.dto.request.SoforSaveRequestDto;
import com.muhammet.uber.mapper.ISoforMapper;
import com.muhammet.uber.repository.ISoforRepository;
import com.muhammet.uber.repository.entity.Sofor;
import com.muhammet.uber.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class SoforService extends ServiceManager<Sofor,Long> {
    private final ISoforRepository repository;
    public SoforService(ISoforRepository repository){
        super(repository);
        this.repository=repository;
    }

    public Sofor saveDto(SoforSaveRequestDto dto) {
        return save(ISoforMapper.INSTANCE.toSofor(dto));
    }
}
