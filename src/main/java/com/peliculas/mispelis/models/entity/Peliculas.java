/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.models.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Beatriz
 */
@Entity
@Table(name="Peliculas")
public class Peliculas implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id_pelicula;
    
    @NotNull
    @Column(length=150)
    private String titulo;
    
    @NotNull
    private Long duracion;
    
    @NotNull
    private Long anio_estreno;
    
    @Column(length=200)
    private String portada;
    

    @JoinTable(
        name = "peliculas_generos",
        joinColumns = @JoinColumn(name = "id_pelicula", nullable = false),
        inverseJoinColumns = @JoinColumn(name="id_genero", nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Generos> generos;
   
    public void addGenero(Generos genero){
        if(this.generos == null){
            this.generos = new ArrayList<>();
        }        
        this.generos.add(genero);
    }

    public Long getId_pelicula() {
        return id_pelicula;
    }

    public List<Generos> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Generos> generos) {
        this.generos = generos;
    }

    public void setId_pelicula(Long id_pelicula) {
        this.id_pelicula = id_pelicula;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Long getDuracion() {
        return duracion;
    }

    public void setDuracion(Long duracion) {
        this.duracion = duracion;
    }

    public Long getAnio_estreno() {
        return anio_estreno;
    }

    public void setAnio_estreno(Long anio_estreno) {
        this.anio_estreno = anio_estreno;
    }

    
    public String getPortada() {
        return portada;
    }

    public void setPortada(String portada) {
        this.portada = portada;
    }
    
    private static final long serialVersionUID = 1L;
    
}
