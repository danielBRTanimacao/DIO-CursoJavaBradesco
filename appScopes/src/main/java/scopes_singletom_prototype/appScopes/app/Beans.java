package scopes_singletom_prototype.appScopes.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Beans {
    @Bean
    @Scope("prototype")
    public Remetente remetente() {
        System.out.println("Criando um objeto Remetente");
        Remetente remetente = new Remetente();
        remetente.setEmail("noreply@gmail.com");
        remetente.setNome("Bababui");
        return remetente;
    }
}
