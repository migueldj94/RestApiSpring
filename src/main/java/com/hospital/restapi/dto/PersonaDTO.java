package com.hospital.restapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaDTO {
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private Integer edad;
    private String telefono;

    public PersonaDTO(int id, String nombre, String apellido, String cedula, Integer edad, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }

    // Getters y setters adicionales si es necesario
}
