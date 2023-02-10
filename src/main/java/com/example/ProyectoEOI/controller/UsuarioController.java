package com.example.ProyectoEOI.controller;

import com.example.ProyectoEOI.dto.ReservaDTO;
import com.example.ProyectoEOI.dto.UsuarioDTO;
import com.example.ProyectoEOI.exceptions.ReservaException;
import com.example.ProyectoEOI.exceptions.UsuarioException;
import com.example.ProyectoEOI.model.Usuario;
import com.example.ProyectoEOI.service.UsuarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class UsuarioController {

    // TODO: Añadir el control de errores en pagina

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/login")
    public String vistaLogin(ModelMap interfaz){
        UsuarioDTO usuarioDto = new UsuarioDTO();
        interfaz.addAttribute("datosUsuario", usuarioDto);
        return "login";
    }

    @PostMapping(value = "/login")
    public String logingUsusario(UsuarioDTO usuario) throws UsuarioException {
        usuario = this.usuarioService.login(usuario);
        Long id = usuario.getId();
        return "redirect:/usuario/%s".formatted(id);
    }

    @GetMapping("/registro")
    public String registroUsuario(ModelMap interfaz) {
        UsuarioDTO usuarioDto = new UsuarioDTO();
        interfaz.addAttribute("datosUsuario", usuarioDto);
        return "registro";
    }

    @PostMapping(value = "/registro")
    public String crearUsuario(UsuarioDTO usuario) throws UsuarioException {
        UsuarioDTO nuevoUsuario = this.usuarioService.crearUsuario(usuario);
        Long id = nuevoUsuario.getId();
        return "redirect:/usuario/%s".formatted(id);
    }
    @PostMapping(value = "/usuario/{id}")
    public String modificarUsuario (@PathVariable Long id, UsuarioDTO usuario) throws UsuarioException {
        usuario = this.usuarioService.modificarUsuario(usuario, id);
        Long idUsuario = usuario.getId();
        return "redirect:/usuario/%s".formatted(idUsuario);
    }


    @GetMapping(value="/usuario/{id}")
    public String verUsuario(@PathVariable Long id, ModelMap interfaz) throws UsuarioException {
        UsuarioDTO usuario = this.usuarioService.buscarUsuarioPorId(id);
        interfaz.addAttribute("datosUsuario", usuario);
        return "perfil_usuario";
    }
}
