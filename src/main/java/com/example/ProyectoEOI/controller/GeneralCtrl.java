package com.example.ProyectoEOI.controller;

import com.example.ProyectoEOI.model.Excursion;
import com.example.ProyectoEOI.service.ExcursionService;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"","/"})
public class GeneralCtrl {

    private ExcursionService srvc;

    public GeneralCtrl(ExcursionService srvc) {
        this.srvc = srvc;
    }

    @GetMapping("")  // esto es la ruta raiz de la ruta indicada en el @RequestMapping
    public String paginaInicio(ModelMap modMap) {
        List<Excursion> listaExcursiones = this.srvc.listarExcursiones();
        modMap.addAttribute("listaExcur", listaExcursiones.subList(0,3));
        return "index.html";
    }
}
