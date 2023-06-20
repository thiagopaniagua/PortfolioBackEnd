/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demos2.Security.Repository;

import com.example.demos2.Security.Entity.Rol;
import com.example.demos2.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author titip
 */
@Repository
public interface RolRepository  extends JpaRepository<Rol, Integer>{
    Optional<Rol>findByRolNombre(RolNombre rolNombre);
}
