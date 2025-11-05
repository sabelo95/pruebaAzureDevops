package com.enyoi.university.repository;

import com.enyoi.university.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ICursoRepositry extends JpaRepository<Curso,Long> {
    @Query("SELECT c FROM Curso c WHERE LOWER(c.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Curso> buscarPorNombre(String nombre);
}
