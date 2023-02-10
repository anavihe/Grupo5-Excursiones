package com.example.ProyectoEOI.repository;

import com.example.ProyectoEOI.model.Reserva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<Reserva, Long> {

    Page<Reserva> findByUsuarioId(Long userId, Pageable pageable);
}
