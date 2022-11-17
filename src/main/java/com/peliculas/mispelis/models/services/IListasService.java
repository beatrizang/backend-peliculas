/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.entity.Listas;
import java.util.List;

/**
 *
 * @author Beatriz
 */
public interface IListasService {
    public List<Listas> findAll();
    
    public Listas findById(Long id);
    
    public Listas save(Listas lista);
    
    public void delete(Long id);
}
