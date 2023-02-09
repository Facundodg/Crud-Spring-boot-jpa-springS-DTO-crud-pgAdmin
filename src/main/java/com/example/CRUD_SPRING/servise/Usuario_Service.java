package com.example.CRUD_SPRING.servise;

import com.example.CRUD_SPRING.DTO.UsuarioDTO;
import com.example.CRUD_SPRING.model.Materia_model;
import com.example.CRUD_SPRING.model.Usuario_model;
import com.example.CRUD_SPRING.repository.Usuario_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Usuario_Service {

    @Autowired
    Usuario_Repository usuario_Repository;

    public UsuarioDTO mostrarUsuario(String email, String password) {

        Usuario_model usuario_Model = usuario_Repository.findByEmailAndPassword(email,password);

        UsuarioDTO usuarioDTO = new UsuarioDTO(usuario_Model.getId(),usuario_Model.getEmail(),usuario_Model.getApellido());

        return usuarioDTO;

    }

}
