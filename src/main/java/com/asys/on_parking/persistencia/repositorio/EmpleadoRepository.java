package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, String> {

}
