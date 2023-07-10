package com.hospital.restapi.service;

import com.hospital.restapi.domain.model.Persona;
import com.hospital.restapi.dto.PersonaDTO;
import com.hospital.restapi.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository repository;

    @Autowired
    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public List<Persona> getAllPersonas() {
        return repository.findAll();
    }

    public void crearPersona(PersonaDTO personaDTO) {

        String cedula = personaDTO.getCedula();
        System.out.println(cedula);
        if (repository.existsByCedula(cedula)){
            throw new RuntimeException("Ya existe el numero de cedula: "+cedula);
        }

        Persona persona = new Persona(
                personaDTO.getId(),
                personaDTO.getNombre(),
                personaDTO.getApellido(),
                personaDTO.getCedula(),
                personaDTO.getEdad(),
                personaDTO.getTelefono()
        );

        repository.save(persona);
    }
}
