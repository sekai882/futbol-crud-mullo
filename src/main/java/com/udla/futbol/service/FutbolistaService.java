package com.udla.futbol.service;

import com.udla.futbol.model.Futbolista;
import com.udla.futbol.repository.FutbolistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FutbolistaService {

    @Autowired
    private FutbolistaRepository repository;

    public List<Futbolista> listarTodos() {
        return repository.findAll();
    }

    public void guardar(Futbolista futbolista) {
        repository.save(futbolista);
    }

    public Futbolista obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}