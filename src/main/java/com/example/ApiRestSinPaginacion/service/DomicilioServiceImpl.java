package com.example.ApiRestSinPaginacion.service;

import com.example.ApiRestSinPaginacion.entity.Domicilio;
import com.example.ApiRestSinPaginacion.repository.BaseRepository;
import com.example.ApiRestSinPaginacion.repository.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements BaseService<Domicilio,Long>{
    @Autowired
    protected DomicilioRepository domicilioRepository;
    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository, DomicilioRepository domicilioRepository) {
        super(baseRepository);
        this.domicilioRepository = domicilioRepository;
    }

}