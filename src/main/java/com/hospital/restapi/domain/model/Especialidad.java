package com.hospital.restapi.domain.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Getter
@Setter
@Document(collection = "especialidades")
public class Especialidad implements Serializable {

    @Id
    @NonNull
    private int id;
    private String nombreEspecialidad;

    public Especialidad(int id, String nombreEspecialidad){
        this.id = id;
        this.nombreEspecialidad = nombreEspecialidad;
    }
}
