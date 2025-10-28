package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservaRepository extends JpaRepository<ReservaEntity, Long> {
}
