package com.example.heritage;

import com.example.heritage.Services.AddPersonneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class HeritageApplication {

    public static void main(String[] args) {
        SpringApplication.run(HeritageApplication.class, args);
    }

    @Bean
    CommandLineRunner start(AddPersonneService ps){
        return args -> {
        ps.addEtudiant();
        ps.addProfesseur();
        };

    }

}
