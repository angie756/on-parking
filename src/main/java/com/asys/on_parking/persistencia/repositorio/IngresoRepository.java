package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.IngresoSalidaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface IngresoRepository extends JpaRepository<IngresoSalidaEntity, String>{

    }

