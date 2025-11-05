package com.enyoi.university.service;

import com.enyoi.university.model.Estudiante;
import com.enyoi.university.repository.IEstudianteRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteService {

    private final IEstudianteRepository estudianteRepository;

    public EstudianteService(IEstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;


        try {
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre("santiago");
            estudiante.setCorreo("santiagoberrio@gmail.com");

            Estudiante guardado = estudianteRepository.save(estudiante);

        } catch (Exception e) {
            System.out.println("Error guardando estudiante en el constructor: " + e.getMessage());
        }
    }

    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante save() {
        Estudiante estudiante = new Estudiante();
        estudiante.setNombre("santiago");
        estudiante.setCorreo("santiagoberrio@gmail.com");
        return estudianteRepository.save(estudiante);
    }
}
