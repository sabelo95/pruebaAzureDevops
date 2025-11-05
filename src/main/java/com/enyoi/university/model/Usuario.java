package com.enyoi.university.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name= "usuarios")
//@Getter
//@Setter
//@ToString
//@NoArgsConstructor
//@AllArgsConstructor
//@RequiredArgsConstructor // Variables final, @NotNull
@Data
@NoArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false,unique = true)
    private String email;

    @Column(name = "tipo_usuario", nullable = false)
    private String tipoUsuario;

    @Column(name = "activo",nullable = false)
    private Boolean activo;


}
