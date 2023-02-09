package com.example.CRUD_SPRING.servise;

import com.example.CRUD_SPRING.model.Estudiante_model;
import com.example.CRUD_SPRING.repository.Iestudiante_Repository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.List;//prueba
import java.util.Optional;

@Service
public class Estudiante_Service {
    @Autowired
    private Iestudiante_Repository iestudianteRepository;

    public Estudiante_model saveEstudiante(Estudiante_model estudiante){
            return iestudianteRepository.save(estudiante);
    }
    public Page<Estudiante_model> getAllEstudiantes (Integer page, Integer size, Boolean enablePagination){
        return iestudianteRepository.findAll(enablePagination ? PageRequest.of(page, size): Pageable.unpaged());
    }

    public Optional<Estudiante_model> findById(Long id){
        return iestudianteRepository.findById(id);
    }

    public void deleteEstudiante(Long id){
        iestudianteRepository.deleteById(id);
    }
    public Estudiante_model editEstudiante(Estudiante_model estudiante){

        if (iestudianteRepository.existsById(estudiante.getId())){
            System.out.println(estudiante);
            return iestudianteRepository.save(estudiante);
        }else{
            System.out.println(estudiante);
            System.out.println("no entre");
            return iestudianteRepository.save(estudiante);
        }
    }

    public boolean existById(Long id) {
        return iestudianteRepository.existsById(id);
    }


    public List<Estudiante_model> traerPorId(long id){ //prueba

        return iestudianteRepository.encontrar(id); //prueba

    }


}
