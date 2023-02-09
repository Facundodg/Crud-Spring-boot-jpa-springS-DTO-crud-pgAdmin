package com.example.CRUD_SPRING.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table
public class Usuario_model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String email;
    private String apellido;
    private String password;

}
