/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sigo.api_escuela.repository;

import com.sigo.api_escuela.entity.ApoderadoEntity;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ApoderadoRepository extends JpaRepository<ApoderadoEntity, Long>{
    @Query("select a from ApoderadoEntity a where a.estado = '1'")
    List<ApoderadoEntity> findAllCustom();
}
