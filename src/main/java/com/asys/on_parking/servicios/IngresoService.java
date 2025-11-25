package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.IngresoSalidaEntity;
import com.asys.on_parking.persistencia.repositorio.IngresoRepository;

import java.util.List;

public class IngresoService {

    private final IngresoRepository repository;

    public IngresoService(IngresoRepository repository) {
        this.repository = repository;
    }
    public IngresoSalidaEntity saveIngresoEntity(IngresoSalidaEntity ingreso) {
        return repository.save(ingreso);
    }

    public List<IngresoSalidaEntity> verTodosIngreso() {
        return repository.findAll();
    }
}
