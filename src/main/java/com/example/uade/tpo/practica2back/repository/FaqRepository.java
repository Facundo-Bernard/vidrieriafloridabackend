package com.example.uade.tpo.practica2back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uade.tpo.practica2back.entity.Faq;

@Repository
public interface FaqRepository extends JpaRepository<Faq, Long> {
    // Puedes agregar métodos adicionales si lo necesitas, por ejemplo, para buscar por pregunta
}
