package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.TarifaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarifaRepository extends JpaRepository<TarifaEntity, Long> {
}
