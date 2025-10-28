package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.ZonaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface zonaRepository extends JpaRepository<ZonaEntity, Long> {
}
