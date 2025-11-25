package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "reserva")
@Getter
@Setter
@NoArgsConstructor
public class ReservaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_reserva")
    private Long idReserva;

    @Column(name = "fecha_reserva")
    private LocalDateTime fechaReserva;

    @Column(name = "estado")
    private String estado;

    // Relación: Muchas reservas pertenecen a un usuario
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_usuario",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_RESERVA_USUARIO")
    )
    private UsuarioEntity usuario;

    // Relación: Muchas reservas pertenecen a un vehículo
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_vehiculo",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_RESERVA_VEHICULO")
    )
    private VehiculoEntity vehiculo;

    // Relación: Muchas reservas pertenecen a un espacio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_espacio",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_RESERVA_ESPACIO")
    )
    private EspacioEntity espacio;

    // Relación: Una reserva tiene un ingreso/salida
    @OneToOne(mappedBy = "reserva", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private IngresoSalidaEntity ingresoSalida;
}