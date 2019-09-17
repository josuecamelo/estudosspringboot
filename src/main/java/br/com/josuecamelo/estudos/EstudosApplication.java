package br.com.josuecamelo.estudos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(entityManagerFactoryRef = "dialerEntityManagerFactory", transactionManagerRef = "dialerTransactionManager", basePackages = { "br.com.josuecamelo.com.repositories" })
public class EstudosApplication {

	public static void main(String[] args) {
		SpringApplication.run(EstudosApplication.class, args);
	}

}
