/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.entity.Generos;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public interface IGenerosService {
    public List<Generos> findAll();
    
    public Generos findById(Long id);
    
    public Generos save(Generos genero);
    
    public void delete(Long id);
}
