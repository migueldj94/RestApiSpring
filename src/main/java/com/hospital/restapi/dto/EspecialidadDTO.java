package com.hospital.restapi.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EspecialidadDTO {
    private int id;
    private String nombreEspecialidad;

    public EspecialidadDTO(int id, String nombreEspecialidad) {
        this.id = id;
        this.nombreEspecialidad = nombreEspecialidad;
    }

}
