package com.example.ApiRestSinPaginacion.controllers;

import com.example.ApiRestSinPaginacion.entity.Persona;
import com.example.ApiRestSinPaginacion.service.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/persona")
public class PersonaControllerImpl extends BaseControllerImpl<Persona, PersonaServiceImpl> implements BaseController<Persona,Long> {
}
