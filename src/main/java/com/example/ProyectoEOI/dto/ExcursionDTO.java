package com.example.ProyectoEOI.dto;

import com.example.ProyectoEOI.constants.Dificultad;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExcursionDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private String duracion;
    private Integer maxPersonas;
    private Dificultad dificultad;
    private Double puntuacionMedia;
    private Integer puntuaciones;
    private Double precio;
    private Double descuento;
    private LocalDate fechaAlta;
    private LocalDate fechaModificacion;
}
