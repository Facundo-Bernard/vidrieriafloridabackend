package com.example.uade.tpo.practica2back.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uade.tpo.practica2back.Service.PresentacionService;
import com.example.uade.tpo.practica2back.entity.Presentacion;

@RestController
@RequestMapping("/api/presentacion")
@CrossOrigin(origins =  {"https://vidrieriaflorida-front-u98r.vercel.app",
                "https://vidrieriaeditorfront.vercel.app",
                "https://vidrieriaflorida.com",
                "https://www.vidrieriaflorida.com","*"})
public class PresentacionController {

    @Autowired
    private PresentacionService presentacionService;

    // Obtener la única presentación (si existe)
    @GetMapping
    public ResponseEntity<Presentacion> obtenerPresentacion() {
        Optional<Presentacion> presentacion = presentacionService.obtener();
        return presentacion.map(ResponseEntity::ok)
                           .orElse(ResponseEntity.notFound().build());
    }

    // Crear una nueva presentación (si aún no existe)
    @PostMapping
    public ResponseEntity<Presentacion> crearPresentacion(@RequestBody Presentacion p) {
        return ResponseEntity.ok(presentacionService.crear(p));
    }

    // Actualizar la presentación (por ID)
    @PutMapping("/{id}")
    public ResponseEntity<Presentacion> actualizarPresentacion(@PathVariable Long id,
                                                               @RequestBody Presentacion nueva) {
        return ResponseEntity.ok(presentacionService.actualizar(id, nueva));
    }
}
