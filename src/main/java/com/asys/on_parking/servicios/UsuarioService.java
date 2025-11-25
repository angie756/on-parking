package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.TarifaEntity;
import com.asys.on_parking.persistencia.entidades.UsuarioEntity;
import com.asys.on_parking.persistencia.repositorio.TarifaRepository;
import com.asys.on_parking.persistencia.repositorio.UsuarioRepository;

import java.util.List;

public class UsuarioService {

    private final UsuarioRepository repository;

    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    public UsuarioEntity saveUsuarioEntity(UsuarioEntity usuario) {
        return repository.save(usuario);
    }

    public List<UsuarioEntity> verTodosUsuario() {
        return repository.findAll();

    }
}
