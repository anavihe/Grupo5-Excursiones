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
    private String duracion;
    private Integer maxPersonas;
    private String itinerario;
    private String informacion;
    private String detalles;
    @OneToMany (mappedBy = "excursion")
    private Set<Opinion> opiniones;
    @OneToMany (mappedBy = "excursion")
    private Set<Foto>fotos;

}
