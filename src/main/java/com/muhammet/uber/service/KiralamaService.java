package com.muhammet.uber.service;

import com.muhammet.uber.dto.request.KiralamaSaveRequestDto;
import com.muhammet.uber.mapper.IKiralamaMapper;
import com.muhammet.uber.repository.IKiralamaRepository;
import com.muhammet.uber.repository.entity.Kiralama;
import com.muhammet.uber.repository.entity.KiralamaDurum;
import com.muhammet.uber.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class KiralamaService extends ServiceManager<Kiralama,Long> {
    private final IKiralamaRepository repository;
    public KiralamaService( IKiralamaRepository repository){
        super(repository);
        this.repository=repository;
    }

    public Kiralama saveDto(KiralamaSaveRequestDto dto) {
        Kiralama kiralama = IKiralamaMapper.INSTANCE.toKiralama(dto);
        kiralama.setDurum(KiralamaDurum.TALEP);
        return  save(kiralama);
    }
}
