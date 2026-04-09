package com.udla.futbol.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "futbolistas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Futbolista {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nombre;

    private String equipo;
    private String posicion;
    private Integer edad;
    private Double valorMercado;
}