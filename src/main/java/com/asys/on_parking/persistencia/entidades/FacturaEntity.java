package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Table(name = "factura")
@Getter
@Setter
@NoArgsConstructor
public class FacturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_factura")
    private Long idFactura;

    @Column(name = "numero_factura")
    private String numeroFactura;

    @Column(name = "total")
    private BigDecimal total;

    // Relación: Muchas facturas pertenecen a un pago
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_pago",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_FACTURA_PAGO")
    )
    private PagoEntity pago;
}