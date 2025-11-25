package com.asys.on_parking.persistencia.entidades;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "usuario")
@Getter
@Setter
@NoArgsConstructor
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long idUsuario;

    @Column(name = "nombre_usuario")
    private String nombreUsuario;

    @Column(name = "contrasena")
    private String contrasena;

    @Column(name = "rol")
    private String rol;

    // Relación: Muchos usuarios pertenecen a una persona
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_persona",
            nullable = false,
            foreignKey = @ForeignKey(name = "FK_USUARIO_PERSONA")
    )
    private PersonaEntity persona;

    // Relación: Un usuario puede tener muchas reservas
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ReservaEntity> reservas;
}
