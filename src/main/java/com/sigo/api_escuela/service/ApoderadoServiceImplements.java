/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sigo.api_escuela.service;

import com.sigo.api_escuela.entity.ApoderadoEntity;
import com.sigo.api_escuela.repository.ApoderadoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Permite definir la clase como un servicio
@Service
public class ApoderadoServiceImplements implements ApoderadoService{
    
    //Inyectar dependencias
    @Autowired
    private ApoderadoRepository apoderadoRepository;

    @Override
    public List<ApoderadoEntity> findAll() {
        return apoderadoRepository.findAll();
    }

    @Override
    public List<ApoderadoEntity> findAllCustom() {
        return apoderadoRepository.findAllCustom();
    }

    @Override
    public Optional<ApoderadoEntity> findById(Long id) {
        return apoderadoRepository.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity a) {
        return apoderadoRepository.save(a);
    }

    @Override
    public ApoderadoEntity update(ApoderadoEntity a) {
        ApoderadoEntity objetoApoderado = apoderadoRepository.getById(a.getCodigo());
        BeanUtils.copyProperties(a, objetoApoderado);
        return apoderadoRepository.save(objetoApoderado);
    }

    @Override
    public ApoderadoEntity delete(ApoderadoEntity a) {
        ApoderadoEntity objetoApoderado = apoderadoRepository.getById(a.getCodigo());
        objetoApoderado.setEstado(false);
        return apoderadoRepository.save(objetoApoderado); 
    }
}
