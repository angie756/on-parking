package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<VehiculoEntity, String> {
}
