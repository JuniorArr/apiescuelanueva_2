/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sigo.api_escuela.service;

import com.sigo.api_escuela.entity.DistritoEntity;
import java.util.List;
import java.util.Optional;

public interface DistritoService {
    
    //Funcion que te permita mostrar todos los datos
    List<DistritoEntity> findAll();
    
    //Funcion que te permita mostrar todos los datos habilitados
    List<DistritoEntity> findAllCustom();
    
    //funcion para poder buscar por codigo
    Optional<DistritoEntity> findById(Long id);
    
    //Funcion para registrar datos
    DistritoEntity add (DistritoEntity d);
    
    //Funcion para actualizar datos
    DistritoEntity update (DistritoEntity d);
    
    //Funcion para eliminar datos
    DistritoEntity delete (DistritoEntity d);
    
}
