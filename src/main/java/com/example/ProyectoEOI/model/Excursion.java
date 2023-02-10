package com.example.ProyectoEOI.model;

import com.example.ProyectoEOI.constants.Dificultad;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name= "excursion")
public class Excursion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombre;
    private String descripcion;
    private String duracion;
    private Integer maxPersonas;
    @Enumerated(EnumType.STRING)
    private Dificultad dificultad;
    private Double puntuacionMedia;
    private Integer puntuaciones;
    private Double precio;
    private Double descuento;
    private LocalDate fechaAlta;
    private LocalDate fechaModificacion;

    @OneToMany (mappedBy = "excursion")
    private Set<Opinion> opiniones;

    @OneToMany (mappedBy = "excursion")
    private Set<Foto>fotos;

}
