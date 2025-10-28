package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "vehiculo")
@Getter
@Setter
@NoArgsConstructor
public class VehiculoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vehiculo")
    private Long idVehiculo;

    @Column(name = "placa")
    private String placa;

    @Column(name = "marca")
    private String marca;

    @Column(name = "color")
    private String color;

    // Relación: Muchos vehículos pertenecen a una persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_persona",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_VEHICULO_PERSONA")
    )
    private PersonaEntity persona;

    // Relación: Un vehículo puede tener muchas reservas
    @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReservaEntity> reservas;
}