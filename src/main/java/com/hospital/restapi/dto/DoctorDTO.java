package com.hospital.restapi.dto;

import com.hospital.restapi.domain.model.Especialidad;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Getter
@Setter
public class DoctorDTO {
    private int id;
    private String nombre;
    private String apellido;
    // lista de especialidades
    @DBRef
    private List<Especialidad> especialidades;
    private String consultorio;
    private String correo;

    public DoctorDTO(int id, String nombre, String apellido, List<Especialidad> especialidades, String consultorio, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.especialidades = especialidades;
        this.consultorio = consultorio;
        this.correo = correo;
    }
}
