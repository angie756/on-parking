package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.FacturaEntity;
import com.asys.on_parking.persistencia.entidades.IncidenciaEntity;
import com.asys.on_parking.persistencia.repositorio.FacturaRepository;
import com.asys.on_parking.persistencia.repositorio.IncidenciaRepository;

import java.util.List;

public class IncidenciaService {

    private final IncidenciaRepository repository;

    public IncidenciaService(IncidenciaRepository repository) {
        this.repository = repository;
    }
    public IncidenciaEntity saveIncidenciaEntity(IncidenciaEntity incidencia) {
        return repository.save(incidencia);
    }

    public List<IncidenciaEntity> verTodosIncidencia() {
        return repository.findAll();
    }

}
