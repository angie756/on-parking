package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "parqueadero")
@Getter
@Setter
@NoArgsConstructor
public class ParqueaderoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_parqueadero")
    private Long idParqueadero;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "capacidad_total")
    private Integer capacidadTotal;

    // Relación: Un parqueadero tiene muchas zonas
    @OneToMany(mappedBy = "parqueadero", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ZonaEntity> zonas;  // CAMBIAR de EspacioEntity a ZonaEntity y de "espacio" a "zonas"
}