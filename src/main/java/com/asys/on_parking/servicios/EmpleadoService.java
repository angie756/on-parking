package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.EmpleadoEntity;
import com.asys.on_parking.persistencia.entidades.ParqueaderoEntity;
import com.asys.on_parking.persistencia.repositorio.EmpleadoRepository;
import com.asys.on_parking.persistencia.repositorio.ParqueaderoRepository;

import java.util.List;

public class EmpleadoService {
    private final EmpleadoRepository repository;

    public EmpleadoService(EmpleadoRepository repository) {
        this.repository = repository;
    }
    public EmpleadoEntity saveEmpleadoEntity(EmpleadoEntity empleado) {
        return repository.save(empleado);
    }

    public List<EmpleadoEntity> verTodosEmpleado() {
        return repository.findAll();
    }
}
