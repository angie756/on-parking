package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.EmpleadoEntity;
import com.asys.on_parking.persistencia.entidades.MantenimientoEntity;
import com.asys.on_parking.persistencia.repositorio.EmpleadoRepository;
import com.asys.on_parking.persistencia.repositorio.MantenimientoRepository;

import java.util.List;

public class MantenimientoService {

    private final MantenimientoRepository repository;

    public MantenimientoService(MantenimientoRepository repository) {
        this.repository = repository;
    }
    public MantenimientoEntity saveMantenimientoEntity(MantenimientoEntity mantenimiento) {
        return repository.save(mantenimiento);
    }

    public List<MantenimientoEntity> verTodosMantenimiento() {
        return repository.findAll();
    }
}
