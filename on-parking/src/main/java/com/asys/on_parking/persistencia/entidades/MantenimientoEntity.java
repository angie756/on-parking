package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "mantenimiento")
@Getter
@Setter
@NoArgsConstructor
public class MantenimientoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_mantenimiento")
    private Long idMantenimiento;

    @Column(name = "fecha_mantenimiento")
    private LocalDateTime fechaMantenimiento;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "costo")
    private Long costo;

    @Column(name = "estado")
    private String estado;

    // Relación: Muchos mantenimientos pertenecen a un espacio
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_espacio",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_MANTENIMIENTO_ESPACIO")
    )
    private EspacioEntity espacio;
}