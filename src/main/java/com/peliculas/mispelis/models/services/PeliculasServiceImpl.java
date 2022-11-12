/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.dao.IPeliculasDao;
import com.peliculas.mispelis.models.entity.Peliculas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Beatriz
 */

@Service
public class PeliculasServiceImpl implements IPeliculasService{

    @Autowired
    private IPeliculasDao peliculasDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Peliculas> findAll() {
        return (List<Peliculas>) peliculasDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Peliculas findById(Long id) {
        return peliculasDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Peliculas save(Peliculas pelicula) {
       return peliculasDao.save(pelicula);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        peliculasDao.deleteById(id);
    }
    
}
