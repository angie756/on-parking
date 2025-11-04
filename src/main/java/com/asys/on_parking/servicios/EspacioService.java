package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.EspacioEntity;
import com.asys.on_parking.persistencia.entidades.ParqueaderoEntity;
import com.asys.on_parking.persistencia.repositorio.EspacioRepository;
import com.asys.on_parking.persistencia.repositorio.ParqueaderoRepository;

import java.util.List;

public class EspacioService {

    private final EspacioRepository repository;

    public EspacioService(EspacioRepository repository) {
        this.repository = repository;
    }
    public EspacioEntity saveEspacioEntity(EspacioEntity espacio) {
        return repository.save(espacio);
    }

    public List<EspacioEntity> verTodosEspacio() {
        return repository.findAll();
    }
}
