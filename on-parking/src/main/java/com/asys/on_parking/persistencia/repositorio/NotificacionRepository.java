package com.asys.on_parking.persistencia.repositorio;

import com.asys.on_parking.persistencia.entidades.NotificacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotificacionRepository extends JpaRepository<NotificacionEntity, Long> {
}
