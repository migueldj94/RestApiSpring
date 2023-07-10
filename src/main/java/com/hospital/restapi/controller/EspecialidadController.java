package com.hospital.restapi.controller;

import com.hospital.restapi.domain.model.Especialidad;
import com.hospital.restapi.dto.EspecialidadDTO;
import com.hospital.restapi.service.DoctorService;
import com.hospital.restapi.service.EspecialidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EspecialidadController {
    @Autowired
    private EspecialidadService especialidadService;

    @GetMapping(value = "api/especialidades", produces = "application/json")
    public List<Especialidad> getEspecialidades(){
        return especialidadService.getAllEspecialidades();
    }

    @PostMapping(value = "api/especialidades", produces = "application/json")
    public ResponseEntity saveEspecialidad(@RequestBody EspecialidadDTO especialidadDTO){
        especialidadService.crearEspecialidad(especialidadDTO);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
