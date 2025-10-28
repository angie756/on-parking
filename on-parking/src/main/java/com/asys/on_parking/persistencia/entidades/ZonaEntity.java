package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "zona")
@Getter
@Setter
@NoArgsConstructor
public class ZonaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_zona")
    private Long idZona;

    @Column(name = "nombre_zona")
    private String nombreZona;

    // Relación: Muchas zonas pertenecen a un parqueadero
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_parqueadero",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_ZONA_PARQUEADERO")
    )
    private ParqueaderoEntity parqueadero;

    // Relación: Una zona tiene muchos espacios
    @OneToMany(mappedBy = "zona", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<EspacioEntity> espacios;
}