package com.hospital.restapi.domain.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "Persona")
public class Persona implements Serializable {

    @Id
    @NonNull
    private int id;
    private String nombre;
    private String apellido;
    private String cedula;
    private Integer edad;
    private String telefono;

    public Persona(int id, String nombre, String apellido, String cedula, Integer edad, String telefono){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.telefono = telefono;
    }
}
