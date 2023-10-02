package com.example.ApiRestSinPaginacion.repository;
import com.example.ApiRestSinPaginacion.entity.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}

