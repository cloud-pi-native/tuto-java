package fr.gouv.interieur.dso;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@OpenAPIDefinition(info = @Info(
		title = "App Java Forge Demo API",
		version = "0.0.1-SNAPSHOT",
		description = "API de démonstration DSO"))
@SpringBootApplication
public class AppJavaForgeDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppJavaForgeDemoApplication.class, args);
	}

}
