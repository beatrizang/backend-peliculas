/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.controllers;

import com.peliculas.mispelis.models.entity.Generos;
import com.peliculas.mispelis.models.services.IGenerosService;
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
public class GenerosRestController {
    
    @Autowired
    private IGenerosService generosService;
    
    @GetMapping("/generos")
    public List<Generos> listarGeneros(){
        return generosService.findAll();
    }
    
    @GetMapping("/generos/{id}")
    public Generos mostrarGenero(@PathVariable Long id){
        return generosService.findById(id);
    }
    
    @PostMapping("/generos")
    @ResponseStatus(HttpStatus.CREATED)
    public Generos nuevoGenero(@RequestBody Generos genero){
        return generosService.save(genero);
    }
    
    @PutMapping("/generos/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Generos modificarGenero(@RequestBody Generos genero, @PathVariable Long id){
        Generos generoActual = generosService.findById(id);
        generoActual.setNombre(genero.getNombre());
        
        return generosService.save(generoActual);
    }
    
    @DeleteMapping("/generos/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarGenero(@PathVariable Long id){
        generosService.delete(id);
    }
    
}
