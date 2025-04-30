package com.example.uade.tpo.practica2back.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uade.tpo.practica2back.entity.Presentacion;
import com.example.uade.tpo.practica2back.repository.PresentacionRepository;

@Service
public class PresentacionServiceImpl implements PresentacionService {

    @Autowired
    private PresentacionRepository repo;

    @Override
    public Optional<Presentacion> obtener() {
        return repo.findAll().stream().findFirst(); // solo habrá una
    }

    @Override
    public Presentacion actualizar(Long id, Presentacion nueva) {
        return repo.findById(id)
                .map(p -> {
                    p.setTextoPrincipal(nueva.getTextoPrincipal());
                    p.setTextoSecundario(nueva.getTextoSecundario());
                    return repo.save(p);
                }).orElseThrow(() -> new RuntimeException("Presentación no encontrada"));
    }

    @Override
    public Presentacion crear(Presentacion p) {
        return repo.save(p);
    }
}
