/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolio.mgb.Repository;

import com.portfolio.mgb.Entity.Educacion;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author titip
 */
@Repository
public interface Reducacion extends JpaRepository<Educacion, Integer>{
   public Optional<Educacion> findByNombreE(String nombreE);
   public boolean existsByNombreE(String nombreE);
}
