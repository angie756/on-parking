package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.IncidenciaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<IncidenciaEntity, Long> {
}
