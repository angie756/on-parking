package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.PersonaEntity;
import com.asys.on_parking.persistencia.entidades.ReservaEntity;
import com.asys.on_parking.persistencia.repositorio.PersonaRepository;
import com.asys.on_parking.persistencia.repositorio.ReservaRepository;

import java.util.List;

public class ReservaService {
    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public ReservaEntity saveReservaEntity(ReservaEntity reserva) {
        return repository.save(reserva);
    }

    public List<ReservaEntity> verTodosReserva() {
        return repository.findAll();

    }
}
