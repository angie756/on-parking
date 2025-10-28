package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "empleado")
@Getter
@Setter
@NoArgsConstructor
public class EmpleadoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado")
    private Long idEmpleado;

    @Column(name = "cargo")
    private String cargo;

    @Column(name = "salario")
    private Long salario;

    @Column(name = "estado")
    private String estado;

    // Relación: Muchos empleados pertenecen a una persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_persona",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_EMPLEADO_PERSONA")
    )
    private PersonaEntity persona;
}