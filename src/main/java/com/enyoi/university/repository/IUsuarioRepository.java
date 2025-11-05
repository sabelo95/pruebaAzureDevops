package com.enyoi.university.repository;

import com.enyoi.university.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario,Long> {
    // SELECT * FROM usuarios WHERE email = ?;
    Optional<Usuario> findByEmail(String email);

    // SELECT COUNT(*) > 0 FROM usuarios WHERE email = ?;
    boolean existsByEmail(String email);

    List<Usuario> findByActivoTrue();

    Usuario findByEmailAndActivoTrue(String email);


}
