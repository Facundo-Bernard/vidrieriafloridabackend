package com.example.uade.tpo.practica2back.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")  // Aplica CORS para todos los endpoints
                .allowedOrigins("https://<your-vercel-domain>.vercel.app")  // Reemplaza con tu dominio de Vercel
                .allowedMethods("GET", "POST", "PUT", "DELETE");  // Permite estos métodos HTTP
    }
}
