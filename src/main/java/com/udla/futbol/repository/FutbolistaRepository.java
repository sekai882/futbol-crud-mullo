package com.udla.futbol.repository;

import com.udla.futbol.model.Futbolista;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FutbolistaRepository extends JpaRepository<Futbolista, Long> {
    // Aquí ya tenemos métodos como save(), findAll(), deleteById(), etc.
}