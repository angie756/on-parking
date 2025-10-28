package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<FacturaEntity, Long> {
}
