/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.peliculas.mispelis.models.services;

import com.peliculas.mispelis.models.dao.IPersonasDao;
import com.peliculas.mispelis.models.entity.Personas;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Beatriz
 */
@Service
public class PersonasServiceImpl implements IPersonasService{
    
    @Autowired
    private IPersonasDao personasDao;

    @Override
    public List<Personas> findAll() {
        return (List<Personas>) personasDao.findAll();
    }

    @Override
    public Personas findById(Long id) {
        return personasDao.findById(id).orElse(null);
    }

    @Override
    public Personas save(Personas persona) {
        return personasDao.save(persona);
    }

    @Override
    public void delete(Long id) {
        personasDao.deleteById(id);
    }
    
}
