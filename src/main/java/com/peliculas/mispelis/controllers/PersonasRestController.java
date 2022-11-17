/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.controllers;

import com.peliculas.mispelis.models.entity.Personas;
import com.peliculas.mispelis.models.services.IPersonasService;
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
public class PersonasRestController {
    @Autowired
    private IPersonasService personasService;
    
    @GetMapping("/personas")
    public List<Personas> listarPersonas(){
        return personasService.findAll();
    }
    
    @GetMapping("/personas/{id}")
    public Personas mostrarPersona(@PathVariable Long id){
        return personasService.findById(id);
    }
    
    @PostMapping("/personas")
    @ResponseStatus(HttpStatus.CREATED)
    public Personas nuevaPersona(@RequestBody Personas persona){
        return personasService.save(persona);
    }
    
    @PutMapping("/personas/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Personas modificarPersona(@RequestBody Personas persona, @PathVariable Long id){
        
        Personas personaActual = personasService.findById(id);
        
        personaActual.setApellido(persona.getApellido());
        personaActual.setNombre(persona.getNombre());
        personaActual.setFecha_nacimiento(persona.getFecha_nacimiento());
        personaActual.setNacionalidad(persona.getNacionalidad());
        personaActual.setFoto(persona.getFoto());
        
        
        return personasService.save(personaActual);
    }
    
    @DeleteMapping("/personas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void eliminarPersona(@PathVariable Long id){
        personasService.delete(id);
    }
}

