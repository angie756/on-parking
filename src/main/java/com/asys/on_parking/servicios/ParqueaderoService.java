package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.ParqueaderoEntity;
import com.asys.on_parking.persistencia.repositorio.ParqueaderoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParqueaderoService {

    private final ParqueaderoRepository repository;

    public ParqueaderoService(ParqueaderoRepository repository) {
        this.repository = repository;
    }
    public ParqueaderoEntity saveParqueaderoEntity(ParqueaderoEntity parqueadero) {
        return repository.save(parqueadero);
    }

    public List<ParqueaderoEntity> verTodosParqueadero() {
        return repository.findAll();
    }
}

