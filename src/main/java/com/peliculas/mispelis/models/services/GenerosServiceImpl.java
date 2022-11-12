/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.dao.IGenerosDao;
import com.peliculas.mispelis.models.entity.Generos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Beatriz
 */
@Service
public class GenerosServiceImpl implements IGenerosService{
    
    @Autowired
    private IGenerosDao generosDao;

    @Override
    @Transactional(readOnly=true)
    public List<Generos> findAll() {
        return (List<Generos>) generosDao.findAll();
    }

    @Override
    @Transactional(readOnly=true)
    public Generos findById(Long id) {
       return generosDao.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public Generos save(Generos genero) {
        return generosDao.save(genero);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        generosDao.deleteById(id);
    }
    
}
