/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sigo.api_escuela.service;

import com.sigo.api_escuela.entity.DistritoEntity;
import com.sigo.api_escuela.repository.DistritoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Permite definir la clase como un servicio
@Service
public class DistritoServiceImplements implements DistritoService{
    
    //Inyectar dependencias
    @Autowired
    private DistritoRepository distritoRepository;

    @Override
    public List<DistritoEntity> findAll() {
        return distritoRepository.findAll(); 
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return distritoRepository.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> findById(Long id) {
       return distritoRepository.findById(id); 
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return distritoRepository.save(d); 
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objetoDistrito = distritoRepository.getById(d.getCodigo()); 
        BeanUtils.copyProperties(d, objetoDistrito);
        return distritoRepository.save(objetoDistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objetoDistrito = distritoRepository.getById(d.getCodigo()); 
        objetoDistrito.setEstado(false);
        return distritoRepository.save(objetoDistrito);
    }
}
