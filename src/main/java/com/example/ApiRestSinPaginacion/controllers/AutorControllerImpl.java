package com.example.ApiRestSinPaginacion.controllers;

import com.example.ApiRestSinPaginacion.entity.Autor;
import com.example.ApiRestSinPaginacion.service.AutorServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "apirestsinpaginacion.com/autor")
public class AutorControllerImpl extends BaseControllerImpl<Autor, AutorServiceImpl> implements BaseController<Autor,Long>{
}