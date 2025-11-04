package com.asys.on_parking.api;

import com.asys.on_parking.persistencia.entidades.ParqueaderoEntity;
import com.asys.on_parking.servicios.ParqueaderoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parqueadero")
public class ParqueaderoController {
    private final ParqueaderoService service;

    public ParqueaderoController(ParqueaderoService service) {
        this.service = service;
    }

    @GetMapping("/all")
    public List<ParqueaderoEntity> getAll(){
        return service.verTodosParqueadero();
    }
    @PostMapping("/createparqueadero")
    public ParqueaderoEntity crear (@RequestBody ParqueaderoEntity parqueadero){
        return  service.saveParqueaderoEntity(parqueadero);
    }


}
