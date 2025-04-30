package com.example.uade.tpo.practica2back.Service;

import java.util.Optional;

import com.example.uade.tpo.practica2back.entity.Presentacion;

public interface PresentacionService {
    Optional<Presentacion> obtener();
    Presentacion actualizar(Long id, Presentacion nueva);
    Presentacion crear(Presentacion p);
}
