package com.example.ProyectoEOI.web.controller;

import com.example.ProyectoEOI.dto.ExcursionDTO;
import com.example.ProyectoEOI.model.Excursion;
import com.example.ProyectoEOI.service.ExcursionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/api/excursiones")
public class ExcursionCtrl_API {
    // la variable srvc es una instancia de ExcursionService, que a su vez conecta con ExcursionRepository y con
    // ExcursionMapper.
    private final ExcursionService srvc;

    // ========= Contructor =============
    @Autowired
    public ExcursionCtrl_API(ExcursionService srvc) {
        this.srvc = srvc;
    }
    /*
          ============ Métodos para la gestión de las peticiones HTTP ===================

            Cada uno indica la ruta que "atiende" y el verbo de la misma (GET, POST, etc.)
     */
    @GetMapping({"","/"})  // es la raiz de la ruta indicada en @RequestMapping
    @ResponseBody
    public List<Excursion> listarExcursiones() {
        return this.srvc.listarExcursiones();
    }
}
