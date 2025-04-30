package com.example.uade.tpo.practica2back.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.uade.tpo.practica2back.entity.Faq;
import com.example.uade.tpo.practica2back.repository.FaqRepository;

@Service
public class FaqService {

    private final FaqRepository faqRepository;

    @Autowired
    public FaqService(FaqRepository faqRepository) {
        this.faqRepository = faqRepository;
    }

    // Método para obtener todas las preguntas frecuentes
    public List<Faq> getAllFaqs() {
        return faqRepository.findAll();
    }

    // Método para obtener una pregunta frecuente por su ID
    public Optional<Faq> getFaqById(Long id) {
        return faqRepository.findById(id);
    }

    // Método para guardar una nueva pregunta frecuente
    public Faq saveFaq(Faq faq) {
        return faqRepository.save(faq);
    }

    // Método para eliminar una pregunta frecuente por su ID
    public void deleteFaq(Long id) {
        faqRepository.deleteById(id);
    }
}
