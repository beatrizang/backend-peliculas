/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.controllers;

import com.peliculas.mispelis.models.entity.Generos;
import com.peliculas.mispelis.models.entity.Peliculas;
import com.peliculas.mispelis.models.services.IPeliculasService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Beatriz
 */
@CrossOrigin(origins={"*"})
@RestController
@RequestMapping("/api")
public class PeliculasRestController {
    
    @Autowired
    private IPeliculasService peliculasService;
    
    @GetMapping("/peliculas")
    public List<Peliculas> listarPeliculas(){
        return peliculasService.findAll();
    }
    
    @GetMapping("/peliculas/{id}")
    public Peliculas mostrarPelicula(@PathVariable Long id){
        return peliculasService.findById(id);
    }
    
    @PostMapping("/peliculas")
    @ResponseStatus(HttpStatus.CREATED)
    public Peliculas nuevaPelicula(@RequestBody Peliculas pelicula){
        return peliculasService.save(pelicula);
    }
    
    @PutMapping("/peliculas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Peliculas modificarPelicula(@RequestBody Peliculas pelicula, @PathVariable Long id){
        Peliculas peliculaActual = peliculasService.findById(id);
        peliculaActual.setTitulo(pelicula.getTitulo());
        peliculaActual.setAnio_estreno(pelicula.getAnio_estreno());
        peliculaActual.setDuracion(pelicula.getDuracion());
        peliculaActual.setPortada(pelicula.getPortada());
        peliculaActual.setGeneros(pelicula.getGeneros());
        
        return peliculasService.save(peliculaActual);
    }
    
    @DeleteMapping("/peliculas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarPelicula(@PathVariable Long id){
        peliculasService.delete(id);
    }
    
    @GetMapping("/peliculas/generos")
    public List<Generos> listarGeneros(){
        return peliculasService.findAllGeneros();
    }

}
