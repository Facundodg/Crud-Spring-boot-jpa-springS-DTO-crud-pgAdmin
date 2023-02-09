package com.example.CRUD_SPRING.controller;

import com.example.CRUD_SPRING.model.Estudiante_model;
import com.example.CRUD_SPRING.servise.Estudiante_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Validated
@RestController
@RequestMapping("/estudiante")
public class Estudiante_Controllador {

    @Autowired
    private Estudiante_Service estudiante_service;

    @PostMapping
    public ResponseEntity<Estudiante_model> GuardarEstudiante(@RequestBody Estudiante_model estudiante){

        return ResponseEntity.status(HttpStatus.CREATED).body(estudiante_service.saveEstudiante(estudiante));

    }

    @GetMapping
    public ResponseEntity<Page<Estudiante_model>> getAllStudent (
            @RequestParam(required = false, defaultValue = "0") Integer page,
            @RequestParam(required = false, defaultValue = "10") Integer size,
            @RequestParam(required = false, defaultValue = "false") Boolean enablePagination
    ){
        return ResponseEntity.ok(estudiante_service.getAllEstudiantes(page, size, enablePagination));
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity deleteStudent(@PathVariable ("id") Long id){
        estudiante_service.deleteEstudiante(id);
        return ResponseEntity.ok(!estudiante_service.existById(id));
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Optional<Estudiante_model>> findStudentById(@PathVariable ("id") Long id){
        return ResponseEntity.status(HttpStatus.OK).body(estudiante_service.findById(id));
    }

    @PutMapping
    public ResponseEntity<Estudiante_model> editStudent (@RequestBody Estudiante_model estudiante_model){
        return ResponseEntity.status(HttpStatus.CREATED).body(estudiante_service.editEstudiante(estudiante_model));
    }

    @GetMapping(value = "/encontrar/{idEncontrar}")
    public ResponseEntity<List<Estudiante_model>> encontrarPorId(@PathVariable("idEncontrar") Long idEncontrar){
        return ResponseEntity.status(HttpStatus.OK).body(estudiante_service.traerPorId(idEncontrar));
    }


}
