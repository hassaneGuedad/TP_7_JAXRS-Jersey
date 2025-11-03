package com.example.ms_banque;

import com.example.ms_banque.entities.Compte;
import com.example.ms_banque.entities.TypeCompte;
import com.example.ms_banque.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MsBanqueApplication {
	public static void main(String[] args) {
		SpringApplication.run(MsBanqueApplication.class, args);
	}
}
