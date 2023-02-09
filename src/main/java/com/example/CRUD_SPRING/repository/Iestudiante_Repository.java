package com.example.CRUD_SPRING.repository;

import com.example.CRUD_SPRING.model.Estudiante_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List; //prueba
import java.util.Optional;

@Repository
public interface Iestudiante_Repository extends JpaRepository<Estudiante_model, Long>{

    @Query(value = "Select * from public.estudiante_model where id= :id" , nativeQuery = true) //prueba
    List<Estudiante_model> encontrar(long id); //prueba

}
