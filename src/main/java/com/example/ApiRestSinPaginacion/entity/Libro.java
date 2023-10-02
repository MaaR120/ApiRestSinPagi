package com.example.ApiRestSinPaginacion.entity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Libro extends Base{

    public String titulo;

    public int fecha;

    public String genero;

    public int paginas;

    @ManyToMany(cascade = CascadeType.ALL)
    public List<Autor> autores=new ArrayList<Autor>();

}
