package com.example.ApiRestSinPaginacion.entity;
import jakarta.persistence.*;
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

    @ManyToOne(cascade = CascadeType.REFRESH)
    @JoinColumn(name = "persona_id")
    public Persona persona;

}
