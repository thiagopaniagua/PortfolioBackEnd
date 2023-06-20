/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.demos2.Repository;

import com.example.demos2.Entity.HyS;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author titip
 */
public interface Rhys extends JpaRepository<HyS, Integer> {
    Optional<HyS> findByNombre(String nombre);
    public boolean existsByNombre(String nombre);
}
