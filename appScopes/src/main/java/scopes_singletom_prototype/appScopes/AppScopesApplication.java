package scopes_singletom_prototype.appScopes;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import scopes_singletom_prototype.appScopes.app.SistemaMessages;

@SpringBootApplication
public class AppScopesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppScopesApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(SistemaMessages sistemaMessages) throws Exception {
		return args -> {
			sistemaMessages.enviarConfirmacaoCadastro();
			sistemaMessages.enviarMensagemBoasVindas();
		};
	}

}
