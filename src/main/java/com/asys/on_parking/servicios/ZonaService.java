package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.VehiculoEntity;
import com.asys.on_parking.persistencia.entidades.ZonaEntity;
import com.asys.on_parking.persistencia.repositorio.VehiculoRepository;
import com.asys.on_parking.persistencia.repositorio.zonaRepository;

import java.util.List;

public class ZonaService {
    private final  zonaRepository repository;

    public  ZonaService( zonaRepository repository) {
        this.repository = repository;
    }

    public  ZonaEntity saveZonaEntity( ZonaEntity zona) {
        return repository.save(zona);
    }

    public List< ZonaEntity> verTodosZona() {
        return repository.findAll();

    }
}
