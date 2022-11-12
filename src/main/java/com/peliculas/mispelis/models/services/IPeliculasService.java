/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.entity.Peliculas;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public interface IPeliculasService {
    public List<Peliculas> findAll();
    
    public Peliculas findById(Long id);
    
    public Peliculas save(Peliculas pelicula);
    
    public void delete(Long id);
}
