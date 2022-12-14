package com.ejemplo.Ejemplo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class EjemploApplication {

	public static void main(String[] args) {
		SpringApplication.run(EjemploApplication.class, args);
	}
        
        @Bean
            public WebMvcConfigurer corsConfigurer() {
                    return new WebMvcConfigurer() {
                            @Override
    public void addCorsMappings(CorsRegistry corsRegistry) {
        corsRegistry.addMapping("/**")
                .allowedOrigins("http://localhost:4200")
                .allowedMethods("*")
                .allowedHeaders("*")
                .exposedHeaders("Authorization")
                .allowCredentials(true).maxAge(3600);
    }
           
                    };
            }    

}
