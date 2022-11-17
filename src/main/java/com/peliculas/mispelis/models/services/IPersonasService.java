/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.entity.Personas;
import java.util.List;

/**
 *
 * @author Beatriz
 */

public interface IPersonasService {
    
    public List<Personas> findAll();
    
    public Personas findById(Long id);
    
    public Personas save(Personas persona);
    
    public void delete(Long id);
    
}
