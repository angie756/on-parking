package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "pago")
@Getter
@Setter
@NoArgsConstructor
public class PagoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pago")
    private Long idPago;

    @Column(name = "monto")
    private BigDecimal monto;

    @Column(name = "metodo_pago")
    private String metodoPago;

    // Relación: Muchos pagos pertenecen a una reserva
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_reserva",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_PAGO_RESERVA")
    )
    private ReservaEntity reserva;

    // Relación: Muchos pagos pertenecen a una tarifa
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_tarifa",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_PAGO_TARIFA")
    )
    private TarifaEntity tarifa;
}