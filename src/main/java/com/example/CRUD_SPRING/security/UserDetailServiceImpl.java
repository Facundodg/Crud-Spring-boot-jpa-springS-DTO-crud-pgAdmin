package com.example.CRUD_SPRING.security;

import com.example.CRUD_SPRING.model.Usuario_model;
import com.example.CRUD_SPRING.repository.Usuario_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailServiceImpl {

    @Autowired
    private Usuario_Repository usuarioRepository;


    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException{

        Usuario_model usuario = usuarioRepository
                .findOneByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("El USUARIO CON ESE EMAIL NO EXISTE"));

        return new UserDetailsImpl(usuario);

    }

}
