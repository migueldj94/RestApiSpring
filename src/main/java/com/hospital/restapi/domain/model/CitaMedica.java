package com.hospital.restapi.domain.model;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.print.Doc;
import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Document(collection = "CitasMedicas")
public class CitaMedica implements Serializable {

    @Id
    @NonNull
    private int id;

    @DBRef
    private List<Especialidad> especialidades;

    @DBRef
    private List<Persona> pacientes;

    @DBRef
    private List<Doctor> doctores;

    public CitaMedica(@NonNull int id, List<Especialidad> especialidades, List<Persona> pacientes, List<Doctor> doctores) {
        this.id = id;
        this.especialidades = especialidades;
        this.pacientes = pacientes;
        this.doctores = doctores;
    }
}
