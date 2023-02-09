package com.example.CRUD_SPRING.repository;

import com.example.CRUD_SPRING.model.Materia_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Materia_Repository extends JpaRepository<Materia_model, Long> {

}
