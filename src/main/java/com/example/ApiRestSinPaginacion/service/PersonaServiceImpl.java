package com.example.ApiRestSinPaginacion.service;

import com.example.ApiRestSinPaginacion.entity.Persona;
import com.example.ApiRestSinPaginacion.repository.BaseRepository;
import com.example.ApiRestSinPaginacion.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImpl extends BaseServiceImpl<Persona,Long> implements PersonaService {

    @Autowired
    protected PersonaRepository personaRepository;
    public PersonaServiceImpl(BaseRepository<Persona, Long> baseRepository, PersonaRepository personaRepository) {
        super(baseRepository);
        this.personaRepository = personaRepository;
    }

}
