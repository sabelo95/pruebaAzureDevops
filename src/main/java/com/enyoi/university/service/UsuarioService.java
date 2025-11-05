package com.enyoi.university.service;

import com.enyoi.university.model.Usuario;
import com.enyoi.university.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {


    private final IUsuarioRepository repository;

    public UsuarioService(IUsuarioRepository repository) {
        this.repository = repository;
    }

    public Usuario guardar(Usuario usuario){
        return repository.save(usuario);
    }

    public Optional<Usuario> findByEmail(String email){
        return repository.findByEmail(email);
    }

    public boolean existsByEmail(String email) {
        return repository.existsByEmail(email);
    }

    public List<Usuario> findByActivo(){
       return repository.findByActivoTrue();
    }

    public Usuario findByEmailAndActivo(String email){
        return repository.findByEmailAndActivoTrue(email);
    }

}
