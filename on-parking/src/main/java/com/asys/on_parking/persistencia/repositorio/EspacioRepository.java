package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.EspacioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EspacioRepository extends JpaRepository<EspacioEntity, String> {
}
