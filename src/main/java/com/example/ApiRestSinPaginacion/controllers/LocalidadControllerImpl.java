package com.example.ApiRestSinPaginacion.controllers;

import com.example.ApiRestSinPaginacion.entity.Localidad;
import com.example.ApiRestSinPaginacion.service.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidad")
public class LocalidadControllerImpl extends BaseControllerImpl<Localidad, LocalidadServiceImpl> implements BaseController<Localidad,Long> {
}
