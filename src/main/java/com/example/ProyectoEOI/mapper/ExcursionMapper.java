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
                .duracion(excursion.getDuracion())
                .maxPersonas(excursion.getMaxPersonas())
                .itinerario(excursion.getItinerario())
                .informacion(excursion.getInformacion())
                .detalles(excursion.getDetalles())
                .fotos(excursion.getFotos())
                .build();
    }

    @Override
    public Excursion dtoToEntity(ExcursionDTO excursionDto) {
        return Excursion.builder()
                .id(excursionDto.getId())
                .nombre(excursionDto.getNombre())
                .duracion(excursionDto.getDuracion())
                .maxPersonas(excursionDto.getMaxPersonas())
                .itinerario(excursionDto.getItinerario())
                .informacion(excursionDto.getInformacion())
                .detalles(excursionDto.getDetalles())
                .fotos(excursionDto.getFotos())
                .build();
    }
}
