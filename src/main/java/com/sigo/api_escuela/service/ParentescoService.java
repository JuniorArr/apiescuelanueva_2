/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sigo.api_escuela.service;

import com.sigo.api_escuela.entity.ParentescoEntity;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author donoc
 */
public interface ParentescoService {
    
     //Funcion que te permita mostrar todos los datos
    List<ParentescoEntity> findAll();
    
    //Funcion que te permita mostrar todos los datos habilitados
    List<ParentescoEntity> findAllCustom();
    
    //funcion para poder buscar por codigo
    Optional<ParentescoEntity> findById(Long id);
    
    //Funcion para registrar datos
    ParentescoEntity add (ParentescoEntity p);
    
    //Funcion para actualizar datos
    ParentescoEntity update (ParentescoEntity p);
    
    //Funcion para eliminar datos
    ParentescoEntity delete (ParentescoEntity p);
    
}
