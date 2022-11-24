/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sigo.api_escuela.service;

import com.sigo.api_escuela.entity.ParentescoEntity;
import com.sigo.api_escuela.repository.ParentescoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Permite definir la clase como un servicio
@Service
public class ParentescoServiceImplements implements ParentescoService{
    
    //Inyectar dependencias
    @Autowired
    private ParentescoRepository parentescoRepository;

    @Override
    public List<ParentescoEntity> findAll() {
        return parentescoRepository.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescoRepository.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> findById(Long id) {
        return parentescoRepository.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return parentescoRepository.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objetoParentesco = parentescoRepository.getById(p.getCodigo());
        BeanUtils.copyProperties(p, objetoParentesco);
        return parentescoRepository.save(objetoParentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity objetoParentesco = parentescoRepository.getById(p.getCodigo());
        objetoParentesco.setEstado(false);
        return parentescoRepository.save(objetoParentesco);
    }  
}
