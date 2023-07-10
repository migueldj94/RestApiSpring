package com.hospital.restapi.dto;

import com.hospital.restapi.domain.model.Doctor;
import com.hospital.restapi.domain.model.Especialidad;
import com.hospital.restapi.domain.model.Persona;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.List;

@Getter
@Setter
public class CitaMedicaDTO {

    private int id;

    @DBRef
    private List<Especialidad> especialidades;

    @DBRef
    private List<Persona> pacientes;

    @DBRef
    private List<Doctor> doctores;

    public CitaMedicaDTO(int id, List<Especialidad> especialidades, List<Persona> pacientes, List<Doctor> doctores) {
        this.id = id;
        this.especialidades = especialidades;
        this.pacientes = pacientes;
        this.doctores = doctores;
    }
}
