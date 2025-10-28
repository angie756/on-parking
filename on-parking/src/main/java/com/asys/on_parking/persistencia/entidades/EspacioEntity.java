package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "espacio")
@Getter
@Setter
@NoArgsConstructor
public class EspacioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_espacio")
    private Long idEspacio;

    @Column(name = "codigo_espacio")
    private String codigoEspacio;

    @Column(name = "tipo_vehiculo")
    private String tipoVehiculo;

    @Column(name = "disponible")
    private Boolean disponible;

    // Relación: Muchos espacios pertenecen a una zona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_zona",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_ESPACIO_ZONA")
    )
    private ZonaEntity zona;

    // Relación: Un espacio puede tener muchas reservas
    @OneToMany(mappedBy = "espacio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReservaEntity> reservas;

    // Relación: Un espacio puede tener muchos mantenimientos
    @OneToMany(mappedBy = "espacio", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<MantenimientoEntity> mantenimientos;
}