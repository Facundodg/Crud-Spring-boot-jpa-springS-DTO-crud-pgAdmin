package com.example.CRUD_SPRING.controller;

import com.example.CRUD_SPRING.model.Estudiante_model;
import com.example.CRUD_SPRING.model.Materia_model;
import com.example.CRUD_SPRING.servise.Materia_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/materia")
public class Materia_Controllador {

    @Autowired
    private Materia_Service materia_service;

    @PostMapping
    public ResponseEntity<Materia_model> GuardarMateria(@RequestBody Materia_model materia){

        return ResponseEntity.status(HttpStatus.CREATED).body(materia_service.saveMateria(materia));

    }

    @GetMapping
    public ResponseEntity<List<Materia_model>> MostrarMaterias(){

        return ResponseEntity.ok(materia_service.mostrarMaterias());

    }

}
