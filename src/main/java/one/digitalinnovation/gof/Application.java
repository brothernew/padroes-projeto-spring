package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring boot gerado via Spring Initializr.
 * Os seguintes módulos foram selecionados:
 * - Spring Data JPD
 * - Spring Web
 * - H2 Database
 * - OpenFeign
 *
 * @author Thiago
 */

@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
