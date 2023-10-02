package com.example.ApiRestSinPaginacion.service;

import com.example.ApiRestSinPaginacion.entity.Libro;
import com.example.ApiRestSinPaginacion.entity.Localidad;
import com.example.ApiRestSinPaginacion.repository.BaseRepository;
import com.example.ApiRestSinPaginacion.repository.LibroRepository;
import com.example.ApiRestSinPaginacion.repository.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements BaseService<Localidad,Long>{
    @Autowired
    protected LocalidadRepository localidadRepository;
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}