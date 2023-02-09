package com.example.CRUD_SPRING.DTO;

import lombok.Data;

@Data
public class UsuarioDTO {

    private long id;
    private String email;
    private String apellido;

    public UsuarioDTO(long id, String email, String apellido) {
        this.id = id;
        this.email = email;
        this.apellido = apellido;
    }

    public UsuarioDTO() {
    }

}
