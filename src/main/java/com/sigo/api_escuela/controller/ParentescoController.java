/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sigo.api_escuela.controller;

import com.sigo.api_escuela.entity.ParentescoEntity;
import com.sigo.api_escuela.service.ParentescoService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parentesco")

public class ParentescoController {
    
    @Autowired
    private ParentescoService parentescoService;
    
    @GetMapping
    public List<ParentescoEntity> findAll(){
        return parentescoService.findAll();
    }
    @GetMapping("/custom")
    public List<ParentescoEntity> findAllCustom(){
        return parentescoService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<ParentescoEntity> findById(@PathVariable Long id){
        return parentescoService.findById(id);
    }

    @PostMapping
    public ParentescoEntity add(@RequestBody ParentescoEntity p){
        return parentescoService.add(p);
    }

    @PutMapping("/{id}")
    public ParentescoEntity update(@PathVariable long id, @RequestBody ParentescoEntity p) {
        p.setCodigo(id);
        return parentescoService.update(p);
    }

    @DeleteMapping("/{id}")
    public ParentescoEntity delete(@PathVariable long id) {
        ParentescoEntity ObjetoParentesco = new ParentescoEntity();
        ObjetoParentesco.setEstado(false);
        return parentescoService.delete(ParentescoEntity.builder().codigo(id).build());
    }
}
