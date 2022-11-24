/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sigo.api_escuela.service;

import com.sigo.api_escuela.entity.ApoderadoEntity;
import java.util.List;
import java.util.Optional;

public interface ApoderadoService {
    
    //Funcion que te permita mostrar todos los datos
    List<ApoderadoEntity> findAll();
    
    //Funcion que te permita mostrar todos los datos habilitados
    List<ApoderadoEntity> findAllCustom();
    
    //funcion para poder buscar por codigo
    Optional<ApoderadoEntity> findById(Long id);
    
    //Funcion para registrar datos
    ApoderadoEntity add (ApoderadoEntity a);
    
    //Funcion para actualizar datos
    ApoderadoEntity update (ApoderadoEntity a);
    
    //Funcion para eliminar datos
    ApoderadoEntity delete (ApoderadoEntity a);
    
}
