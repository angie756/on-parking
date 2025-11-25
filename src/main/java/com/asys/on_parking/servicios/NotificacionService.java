package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.MantenimientoEntity;
import com.asys.on_parking.persistencia.entidades.NotificacionEntity;
import com.asys.on_parking.persistencia.repositorio.MantenimientoRepository;
import com.asys.on_parking.persistencia.repositorio.NotificacionRepository;

import java.util.List;

public class NotificacionService {
    private final NotificacionRepository repository;

    public NotificacionService(NotificacionRepository repository) {
        this.repository = repository;
    }
    public NotificacionEntity saveNotificacionEntity(NotificacionEntity notificacion) {
        return repository.save(notificacion);
    }

    public List<NotificacionEntity> verTodosNotificacion() {
        return repository.findAll();
    }
}
