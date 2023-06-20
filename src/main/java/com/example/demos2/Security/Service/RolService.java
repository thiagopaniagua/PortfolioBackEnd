/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demos2.Security.Service;

import com.example.demos2.Security.Entity.Rol;
import com.example.demos2.Security.Enums.RolNombre;
import com.example.demos2.Security.Repository.RolRepository;
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
public class RolService {
    @Autowired
    RolRepository irolRepository;
    
    public Optional<Rol> getByRolNombre(RolNombre rolNombre){
        return irolRepository.findByRolNombre(rolNombre);
    }
    public void save (Rol rol){
        irolRepository.save(rol);
    } 

}
