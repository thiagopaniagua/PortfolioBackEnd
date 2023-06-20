/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demos2.Service;

import com.example.demos2.Entity.Persona;
import com.example.demos2.Repository.ipersonaRepository;
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
public class impPersonaService {
     @Autowired ipersonaRepository iPersonaRepository;
    
     public List<Persona> list(){
        return iPersonaRepository.findAll();
    }
    
    public Optional<Persona> getOne(int id){
        return iPersonaRepository.findById(id);
    }
    
    public Optional<Persona> getByNombre(String nombre){
        return iPersonaRepository.findByNombre(nombre);
    }
    
    public void save(Persona persona){
        iPersonaRepository.save(persona);
    }
    public void delete(int id){
        iPersonaRepository.deleteById(id);
    }
    
    public boolean existById(int id){
        return iPersonaRepository.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return iPersonaRepository.existsByNombre(nombre);
    }
}
