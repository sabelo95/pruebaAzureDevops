package com.enyoi.university.controller;

import com.enyoi.university.model.Usuario;
import com.enyoi.university.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/user")
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @PostMapping()
    public Usuario guardar(@RequestBody Usuario usuario){
        return service.guardar(usuario);
    }

    @GetMapping("/{email}")
    public ResponseEntity<?> findByEmail(@PathVariable String email) {
        if (!service.existsByEmail(email)) {
            return ResponseEntity.status(404).body("El correo " + email + " no existe en la base de datos");
        }

        Usuario usuario = service.findByEmail(email).get();
        return ResponseEntity.ok(usuario);
    }

    @GetMapping("activo")
    public ResponseEntity<List<Usuario>> findByActive(){
        List<Usuario> usuariosActivos = service.findByActivo();
        return ResponseEntity.ok(usuariosActivos);
    }

    @GetMapping("activoEmail/{email}")
    public ResponseEntity<Usuario> findByActiven(@PathVariable String email ){
        Usuario usuartioActivo = service.findByEmailAndActivo(email);
        return ResponseEntity.ok(usuartioActivo);
    }
}
