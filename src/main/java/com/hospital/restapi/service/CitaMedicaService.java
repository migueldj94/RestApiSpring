package com.hospital.restapi.service;

import com.hospital.restapi.domain.model.CitaMedica;
import com.hospital.restapi.domain.model.Especialidad;
import com.hospital.restapi.dto.CitaMedicaDTO;
import com.hospital.restapi.dto.EspecialidadDTO;
import com.hospital.restapi.repository.CitaMedicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaMedicaService {

    @Autowired
    private CitaMedicaRepository citaMedicaRepository;

    public List<CitaMedica> getCitasPorEspecialidad(Especialidad especialidad){
        return citaMedicaRepository.findByEspecialidades(especialidad);
    }

    public List<CitaMedica> getAllCitasMedicas(){
        return citaMedicaRepository.findAll();
    }

    public void crearCitaMedica(CitaMedicaDTO citaMedicaDTO){
        CitaMedica citaMedica = new CitaMedica(
                citaMedicaDTO.getId(),
                citaMedicaDTO.getEspecialidades(),
                citaMedicaDTO.getPacientes(),
                citaMedicaDTO.getDoctores()
        );

        citaMedicaRepository.save(citaMedica);
    }



}
