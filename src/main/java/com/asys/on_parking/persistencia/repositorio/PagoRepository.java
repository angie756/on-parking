package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.PagoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagoRepository extends JpaRepository<PagoEntity, Long> {
}