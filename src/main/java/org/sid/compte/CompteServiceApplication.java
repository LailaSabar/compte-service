package org.sid.compte;

import java.math.BigDecimal;
import java.util.Date;

import org.sid.compte.entities.Compte;
import org.sid.compte.repositories.CompteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class CompteServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CompteServiceApplication.class, args);
	}
	
	@Bean
	CommandLineRunner start(CompteRepository compteRepository, RepositoryRestConfiguration restConfiguration) {
		restConfiguration.exposeIdsFor(Compte.class);
		return args->{
			
			
			compteRepository.save(new Compte(null,"12345678",400,500,null,null,null,null));
			
		};
		
	}

}
