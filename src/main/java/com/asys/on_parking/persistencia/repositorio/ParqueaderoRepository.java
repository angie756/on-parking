package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.ParqueaderoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParqueaderoRepository extends JpaRepository<ParqueaderoEntity, String > {
}

