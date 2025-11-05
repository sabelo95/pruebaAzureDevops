package com.enyoi.university.service;

import com.enyoi.university.model.Curso;
import com.enyoi.university.repository.ICursoRepositry;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CursoService {

    private final ICursoRepositry cursoRepositry;

    public List<Curso> obtenerCursosPorNombre(String nombre){
       return cursoRepositry.buscarPorNombre(nombre);
    }
}
