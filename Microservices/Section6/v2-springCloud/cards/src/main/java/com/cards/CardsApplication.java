package com.cards;

import com.cards.dto.CardsContactInfoDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = {CardsContactInfoDto.class})
@OpenAPIDefinition(
		info = @Info(
				title = "Cards microservice REST API documentation",
				description = "Shamanth cards microservice REST API documentation",
				version = "V1",
				contact = @Contact(
						name = "Shamanth S",
						email = "shamanth6402@gmail.com",
						url = "https://www.linkedin.com/in/shamanth64/"
				),
				license = @License(
						name = "Apache 2.0",
						url = "https://www.linkedin.com/in/shamanth64/"
				)
		),
		externalDocs = @ExternalDocumentation(
				description = "Shamanth loans microservice REST API documentation",
				url = "http://localhost:9000/swagger-ui/index.html#/"
		)
)
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}

}
