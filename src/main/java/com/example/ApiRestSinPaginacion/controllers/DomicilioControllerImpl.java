package com.example.ApiRestSinPaginacion.controllers;

import com.example.ApiRestSinPaginacion.entity.Domicilio;
import com.example.ApiRestSinPaginacion.service.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "apirestsinpaginacion.com/domicilio")
public class DomicilioControllerImpl extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> implements BaseController<Domicilio,Long>{
}
