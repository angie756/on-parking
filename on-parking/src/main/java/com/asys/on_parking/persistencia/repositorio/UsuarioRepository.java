package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
}
