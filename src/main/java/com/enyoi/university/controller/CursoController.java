package com.enyoi.university.controller;

import com.enyoi.university.model.Curso;
import com.enyoi.university.service.CursoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/course")
@RequiredArgsConstructor
public class CursoController {

    private final CursoService cursoService;

    @GetMapping("/{nombre}")
    public ResponseEntity<List<Curso>> obtenerCursos(@PathVariable String nombre){
        return ResponseEntity.ok((cursoService.obtenerCursosPorNombre(nombre)));
    }


}
