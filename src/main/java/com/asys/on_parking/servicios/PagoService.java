package com.asys.on_parking.servicios;

import com.asys.on_parking.persistencia.entidades.NotificacionEntity;
import com.asys.on_parking.persistencia.entidades.PagoEntity;
import com.asys.on_parking.persistencia.repositorio.NotificacionRepository;
import com.asys.on_parking.persistencia.repositorio.PagoRepository;

import java.util.List;


    public class PagoService {
        private final PagoRepository repository;

        public PagoService(PagoRepository repository) {
            this.repository = repository;
        }

        public PagoEntity savePagoEntity(PagoEntity pago) {
            return repository.save(pago);
        }

        public List<PagoEntity> verTodosPago() {
            return repository.findAll();

        }
    }

