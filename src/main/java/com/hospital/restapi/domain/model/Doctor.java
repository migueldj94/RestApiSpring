package com.hospital.restapi.domain.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Document(collection = "Doctores")
public class Doctor implements Serializable {

    @Id
    @NonNull
    private int id;
    private String nombre;
    private String apellido;
    // lista de especialidades
    @DBRef
    private List<Especialidad> especialidades;
    private String consultorio;
    private String correo;

    public Doctor(@NonNull int id, String nombre, String apellido, List<Especialidad> especialidades, String consultorio, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidades = especialidades;
        this.consultorio = consultorio;
        this.correo = correo;
    }
}
