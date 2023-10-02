package com.example.ApiRestSinPaginacion.service;

import com.example.ApiRestSinPaginacion.entity.Libro;
import com.example.ApiRestSinPaginacion.repository.BaseRepository;
import com.example.ApiRestSinPaginacion.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements BaseService<Libro,Long>{
    @Autowired
    protected LibroRepository libroRepository;
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository, LibroRepository libroRepository) {
        super(baseRepository);
        this.libroRepository = libroRepository;
    }
}