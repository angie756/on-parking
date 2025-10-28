package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.PersonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<PersonaEntity, String> {
}
