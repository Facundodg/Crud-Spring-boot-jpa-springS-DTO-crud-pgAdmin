package com.example.CRUD_SPRING.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Estudiante_model {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String nombre;
    private String apellido;
    private int edad;

}
