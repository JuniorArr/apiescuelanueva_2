/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sigo.api_escuela.repository;

import com.sigo.api_escuela.entity.DistritoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DistritoRepository extends JpaRepository<DistritoEntity, Long> {
      @Query("select d from DistritoEntity d where d.estado = '1'")
    List<DistritoEntity> findAllCustom();
}
