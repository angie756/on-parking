package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Entity
@Table(name = "ingreso_salida")
@Getter
@Setter
@NoArgsConstructor
public class IngresoSalidaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingreso_salida")
    private Long idIngresoSalida;

    @Column(name = "hora_ingreso")
    private LocalDateTime horaIngreso;

    @Column(name = "hora_salida")
    private LocalDateTime horaSalida;

    // Relación: Un ingreso/salida pertenece a una reserva
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_reserva",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_INGRESO_SALIDA_RESERVA")
    )
    private ReservaEntity reserva;
}