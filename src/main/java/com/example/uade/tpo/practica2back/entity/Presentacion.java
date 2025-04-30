package com.example.uade.tpo.practica2back.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Presentacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String textoPrincipal;
    private String textoSecundario;

    // Constructor vacío (requerido por JPA)
    public Presentacion() {
    }

    // Constructor con parámetros
    public Presentacion(String textoPrincipal, String textoSecundario) {
        this.textoPrincipal = textoPrincipal;
        this.textoSecundario = textoSecundario;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getTextoPrincipal() {
        return textoPrincipal;
    }

    public void setTextoPrincipal(String textoPrincipal) {
        this.textoPrincipal = textoPrincipal;
    }

    public String getTextoSecundario() {
        return textoSecundario;
    }

    public void setTextoSecundario(String textoSecundario) {
        this.textoSecundario = textoSecundario;
    }
}
