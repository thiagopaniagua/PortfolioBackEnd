/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demos2.Service;

import com.example.demos2.Entity.Educacion;
import com.example.demos2.Repository.Reducacion;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author titip
 */
@Service
@Transactional
public class Seducacion {
    @Autowired
    Reducacion reducacion;
    
    public List<Educacion> list(){
        return reducacion.findAll();
    }
    
    public Optional<Educacion> getOne(int id){
        return reducacion.findById(id);
    }
    
    public Optional<Educacion> getByNmbreE(String nombreE){
        return reducacion.findByNombreE(nombreE);
    }
    
    public void save(Educacion educacion){
        reducacion.save(educacion);
    }
    public void delete(int id){
        reducacion.deleteById(id);
    }
    
    public boolean existById(int id){
        return reducacion.existsById(id);
    }
    
    public boolean existsByNombreE(String nombreE){
        return reducacion.existsByNombreE(nombreE);
    }
    
}
