package com.muhammet.uber.service;

import com.muhammet.uber.dto.request.MusteriSaveRequestDto;
import com.muhammet.uber.mapper.IMusteriMapper;
import com.muhammet.uber.repository.IMusteriRepository;
import com.muhammet.uber.repository.entity.Musteri;
import com.muhammet.uber.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class MusteriService extends ServiceManager<Musteri,Long> {
    private final IMusteriRepository repository;
    public MusteriService(IMusteriRepository repository){
        super(repository);
        this.repository = repository;

    }

    public Musteri saveDto(MusteriSaveRequestDto dto) {
      return save(IMusteriMapper.INSTANCE.toMusteri(dto));
    }
}
