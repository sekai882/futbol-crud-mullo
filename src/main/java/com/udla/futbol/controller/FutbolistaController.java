package com.udla.futbol.controller;

import com.udla.futbol.model.Futbolista;
import com.udla.futbol.service.FutbolistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/futbolistas")
public class FutbolistaController {

    @Autowired
    private FutbolistaService service;

    // Ruta para listar todos los futbolistas
    @GetMapping
    public String listarFutbolistas(Model model) {
        model.addAttribute("futbolistas", service.listarTodos());
        return "futbolistas"; // Retorna el nombre del archivo HTML (futbolistas.html)
    }

    // Ruta para mostrar el formulario de "Nuevo Futbolista"
    @GetMapping("/nuevo")
    public String mostrarFormularioDeRegistro(Model model) {
        Futbolista futbolista = new Futbolista();
        model.addAttribute("futbolista", futbolista);
        return "crear_futbolista"; // Retorna crear_futbolista.html
    }

    // Acción de guardar el futbolista
    @PostMapping
    public String guardarFutbolista(@ModelAttribute("futbolista") Futbolista futbolista) {
        service.guardar(futbolista);
        return "redirect:/futbolistas";
    }

    // Ruta para mostrar el formulario de edición
    @GetMapping("/editar/{id}")
    public String mostrarFormularioDeEdicion(@PathVariable Long id, Model model) {
        model.addAttribute("futbolista", service.obtenerPorId(id));
        return "editar_futbolista";
    }

    // Acción para eliminar
    @GetMapping("/eliminar/{id}")
    public String eliminarFutbolista(@PathVariable Long id) {
        service.eliminar(id);
        return "redirect:/futbolistas";
    }
}