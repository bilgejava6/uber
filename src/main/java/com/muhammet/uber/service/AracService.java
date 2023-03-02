package com.muhammet.uber.service;

import com.muhammet.uber.repository.IAracRepository;
import com.muhammet.uber.repository.entity.Arac;
import com.muhammet.uber.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class AracService extends ServiceManager<Arac,Long> {
    private final IAracRepository repository;
    public AracService(IAracRepository repository){
        super(repository);
        this.repository = repository;
    }
}
