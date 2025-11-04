package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.UsuarioEntity;
import com.asys.on_parking.persistencia.entidades.VehiculoEntity;
import com.asys.on_parking.persistencia.repositorio.UsuarioRepository;
import com.asys.on_parking.persistencia.repositorio.VehiculoRepository;

import java.util.List;

public class VehiculoService {
    private final VehiculoRepository repository;

    public VehiculoService(VehiculoRepository repository) {
        this.repository = repository;
    }

    public VehiculoEntity saveVehiculoEntity(VehiculoEntity vehiculo) {
        return repository.save(vehiculo);
    }

    public List<VehiculoEntity> verTodosVehiculo() {
        return repository.findAll();

    }
}
