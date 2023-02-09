package com.example.CRUD_SPRING.controller;

import com.example.CRUD_SPRING.DTO.UsuarioDTO;
import com.example.CRUD_SPRING.model.Usuario_model;
import com.example.CRUD_SPRING.servise.Usuario_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/usuario")
public class Usuario_Controllador {

    @Autowired
    Usuario_Service usuario_service;

@PostMapping()
public UsuarioDTO mostrarUsuario(@RequestBody Usuario_model usuario){

    return usuario_service.mostrarUsuario(usuario.getEmail(), usuario.getPassword());

}

}
