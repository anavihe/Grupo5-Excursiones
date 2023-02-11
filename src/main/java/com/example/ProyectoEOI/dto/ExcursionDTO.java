package com.example.ProyectoEOI.dto;

import com.example.ProyectoEOI.model.Foto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExcursionDTO {

    private Long id;
    private String nombre;

    private String duracion;
    private Integer maxPersonas;
    private String itinerario;
    private String informacion;
    private String detalles;
    private List<Foto> fotos;


}
