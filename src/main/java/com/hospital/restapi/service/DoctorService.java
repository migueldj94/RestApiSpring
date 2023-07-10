package com.hospital.restapi.service;

import com.hospital.restapi.domain.model.Doctor;
import com.hospital.restapi.dto.DoctorDTO;
import com.hospital.restapi.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor> getAllDoctores(){
        return doctorRepository.findAll();
    }

    public void crearDoctor(DoctorDTO doctorDTO){

        String Email = doctorDTO.getCorreo();

        if (doctorRepository.existsByCorreo(Email)){
            throw new RuntimeException("El Email ya se encuentra registrado: "+ Email);
        }

        Doctor doctor = new Doctor(
                doctorDTO.getId(),
                doctorDTO.getNombre(),
                doctorDTO.getApellido(),
                doctorDTO.getEspecialidades(),
                doctorDTO.getConsultorio(),
                doctorDTO.getCorreo()
        );

        doctorRepository.save(doctor);
    }
}
