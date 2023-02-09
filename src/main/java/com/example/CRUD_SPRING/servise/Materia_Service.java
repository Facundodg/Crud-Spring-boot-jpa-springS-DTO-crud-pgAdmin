package com.example.CRUD_SPRING.servise;

import com.example.CRUD_SPRING.model.Materia_model;
import com.example.CRUD_SPRING.repository.Materia_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Materia_Service {

    @Autowired
    private Materia_Repository materia_Repository;

    public Materia_model saveMateria(Materia_model materia){

        return materia_Repository.save(materia);

    }

    public List<Materia_model> mostrarMaterias() {

        return materia_Repository.findAll();

    }
}
