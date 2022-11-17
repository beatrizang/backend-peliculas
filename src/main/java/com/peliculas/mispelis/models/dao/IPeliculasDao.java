/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.peliculas.mispelis.models.dao;

import com.peliculas.mispelis.models.entity.Generos;
import com.peliculas.mispelis.models.entity.Peliculas;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Beatriz
 */
public interface IPeliculasDao extends JpaRepository<Peliculas,Long>{
    
    @Query("from Generos")
    public List <Generos> findAllGeneros();
}
