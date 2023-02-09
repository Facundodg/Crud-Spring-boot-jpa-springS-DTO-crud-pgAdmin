package com.example.CRUD_SPRING.repository;

import com.example.CRUD_SPRING.model.Usuario_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface Usuario_Repository extends JpaRepository<Usuario_model, Long> {

    Optional<Usuario_model> findOneByEmail(String email);

    Usuario_model findByEmailAndPassword(String email, String Password);


}
