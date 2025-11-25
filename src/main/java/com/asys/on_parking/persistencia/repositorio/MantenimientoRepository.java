package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.MantenimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientoRepository extends JpaRepository<MantenimientoEntity, Long> {
}
