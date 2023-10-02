package com.example.ApiRestSinPaginacion.controllers;

import com.example.ApiRestSinPaginacion.entity.Libro;
import com.example.ApiRestSinPaginacion.service.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "apirestsinpaginacion.com/libro")
public class LibroControllerImpl extends BaseControllerImpl<Libro, LibroServiceImpl> implements BaseController<Libro,Long>{
}
