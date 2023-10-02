package com.example.ApiRestSinPaginacion.service;

import com.example.ApiRestSinPaginacion.entity.Autor;
import com.example.ApiRestSinPaginacion.repository.AutorRepository;
import com.example.ApiRestSinPaginacion.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements BaseService<Autor,Long>{
    @Autowired
    protected AutorRepository autorRepository;
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository, AutorRepository autorRepository) {
        super(baseRepository);
        this.autorRepository = autorRepository;
    }
}