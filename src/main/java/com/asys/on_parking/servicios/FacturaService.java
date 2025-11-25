package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.EspacioEntity;
import com.asys.on_parking.persistencia.entidades.FacturaEntity;
import com.asys.on_parking.persistencia.repositorio.EspacioRepository;
import com.asys.on_parking.persistencia.repositorio.FacturaRepository;

import java.util.List;

public class FacturaService {

    private final FacturaRepository repository;

    public FacturaService(FacturaRepository repository) {
        this.repository = repository;
    }
    public FacturaEntity saveFacturaEntity(FacturaEntity factura) {
        return repository.save(factura);
    }

    public List<FacturaEntity> verTodosFactura() {
        return repository.findAll();
    }
}
