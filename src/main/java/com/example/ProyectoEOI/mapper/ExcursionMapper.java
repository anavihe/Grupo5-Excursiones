package com.example.ProyectoEOI.mapper;

import com.example.ProyectoEOI.dto.ExcursionDTO;
import com.example.ProyectoEOI.model.Excursion;
import org.springframework.stereotype.Component;

@Component
public class ExcursionMapper extends AbstractMapper<Excursion, ExcursionDTO> {

    @Override
    public ExcursionDTO entityToDto(Excursion excursion) {
        return ExcursionDTO.builder()
                .id(excursion.getId())
                .nombre(excursion.getNombre())
                .descripcion(excursion.getDescripcion())
                .duracion(excursion.getDuracion())
                .maxPersonas(excursion.getMaxPersonas())
                .dificultad(excursion.getDificultad())
                .puntuacionMedia(excursion.getPuntuacionMedia())
                .puntuaciones(excursion.getPuntuaciones())
                .precio(excursion.getPrecio())
                .descuento(excursion.getDescuento())
                .fechaAlta(excursion.getFechaAlta())
                .fechaModificacion(excursion.getFechaModificacion())
                .build();
    }

    @Override
    public Excursion dtoToEntity(ExcursionDTO excursionDto) {
        return Excursion.builder()
                .id(excursionDto.getId())
                .nombre(excursionDto.getNombre())
                .descripcion(excursionDto.getDescripcion())
                .duracion(excursionDto.getDuracion())
                .maxPersonas(excursionDto.getMaxPersonas())
                .dificultad(excursionDto.getDificultad())
                .puntuacionMedia(excursionDto.getPuntuacionMedia())
                .puntuaciones(excursionDto.getPuntuaciones())
                .precio(excursionDto.getPrecio())
                .descuento(excursionDto.getDescuento())
                .fechaAlta(excursionDto.getFechaAlta())
                .fechaModificacion(excursionDto.getFechaModificacion())
                .build();
    }
}
