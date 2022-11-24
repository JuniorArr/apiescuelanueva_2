/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sigo.api_escuela.controller;

import com.sigo.api_escuela.entity.DistritoEntity;
import com.sigo.api_escuela.service.DistritoService;
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

//@Controller --> Indica que es un controlador de tipo Spring
//@ResponseBody --> Cuando se agrga esta anotacion se vuelve REST
//@RestController = @Controller + @ResponseBody
//@RestController aparece en la version 4 de Spring
//@RestController -->Indica que es un controlador de tipo REST

@RestController
//@RequestMapping -->Permite definir el nombre del ENDPOINT
@RequestMapping("/distrito")

public class DistritoController {
    @Autowired
    private DistritoService disitritoService;
    
    @GetMapping
    public List<DistritoEntity> findAll(){
        return disitritoService.findAll();
    }
    @GetMapping("/custom")
    public List<DistritoEntity> findAllCustom(){
        return disitritoService.findAllCustom();
    }

    @GetMapping("/{id}")
    public Optional<DistritoEntity> findById(@PathVariable Long id){
        return disitritoService.findById(id);
    }

    @PostMapping
    public DistritoEntity add(@RequestBody DistritoEntity d){
        return disitritoService.add(d);
    }

    @PutMapping("/{id}")
    public DistritoEntity update(@PathVariable long id, @RequestBody DistritoEntity d) {
        d.setCodigo(id);
        return disitritoService.update(d);
    }

    @DeleteMapping("/{id}")
    public DistritoEntity delete(@PathVariable long id) {
        DistritoEntity ObjetoDistrito = new DistritoEntity();
        ObjetoDistrito.setEstado(false);
        return disitritoService.delete(DistritoEntity.builder().codigo(id).build());
    }
}
