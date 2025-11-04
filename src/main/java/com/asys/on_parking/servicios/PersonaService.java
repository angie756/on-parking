package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.PagoEntity;
import com.asys.on_parking.persistencia.entidades.PersonaEntity;
import com.asys.on_parking.persistencia.repositorio.PagoRepository;
import com.asys.on_parking.persistencia.repositorio.PersonaRepository;

import java.util.List;

public class PersonaService {
    private final PersonaRepository repository;

    public PersonaService(PersonaRepository repository) {
        this.repository = repository;
    }

    public PersonaEntity savePersonaEntity(PersonaEntity persona) {
        return repository.save(persona);
    }

    public List<PersonaEntity> verTodosPersona() {
        return repository.findAll();

    }
}
