package com.example.uade.tpo.practica2back.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.uade.tpo.practica2back.Service.FaqService;
import com.example.uade.tpo.practica2back.entity.Faq;

@RestController
@RequestMapping("/api/faq")
@CrossOrigin(origins = {"http://localhost:5174", "http://localhost:5173"})
public class FaqController {

    private final FaqService faqService;

    @Autowired
    public FaqController(FaqService faqService) {
        this.faqService = faqService;
    }

    // Obtener todas las preguntas frecuentes
    @GetMapping
    public List<Faq> getAllFaqs() {
        return faqService.getAllFaqs();
    }

    // Obtener una pregunta frecuente por ID
    @GetMapping("/{id}")
    public ResponseEntity<Faq> getFaqById(@PathVariable Long id) {
        Optional<Faq> faq = faqService.getFaqById(id);
        return faq.map(ResponseEntity::ok)
                  .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // Guardar una nueva pregunta frecuente
    @PostMapping
    public ResponseEntity<Faq> createFaq(@RequestBody Faq faq) {
        Faq savedFaq = faqService.saveFaq(faq);
        return new ResponseEntity<>(savedFaq, HttpStatus.CREATED);
    }

    // Eliminar una pregunta frecuente por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteFaq(@PathVariable Long id) {
        faqService.deleteFaq(id);
        return ResponseEntity.noContent().build();
    }
}
