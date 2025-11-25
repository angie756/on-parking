package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.ReservaEntity;
import com.asys.on_parking.persistencia.entidades.TarifaEntity;
import com.asys.on_parking.persistencia.repositorio.ReservaRepository;
import com.asys.on_parking.persistencia.repositorio.TarifaRepository;

import java.util.List;

public class TarifaService {
    private final TarifaRepository repository;

    public TarifaService(TarifaRepository repository) {
        this.repository = repository;
    }

    public TarifaEntity saveTarifaEntity(TarifaEntity tarifa) {
        return repository.save(tarifa);
    }

    public List<TarifaEntity> verTodosTarifa() {
        return repository.findAll();

    }
}
