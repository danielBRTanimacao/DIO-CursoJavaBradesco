package daniel.springValues.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class SistemaMensagens implements CommandLineRunner {

    @Value("${name:Noreply}") // Ajuda a não deixar valores explicitos!
    private String name;

    @Value("${email:cleitindograu@gmail.com}")
    private String email;
    private List<Long> phones = new ArrayList<>(
            Arrays.asList(
                    new Long[]{12345678910L}
            )
    );

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "Mensagem enviada por: " + this.name
                + "\nEmail: " + this.email
                + "\nCom telefones para contato: " + this.phones);
        System.out.println("Seu cadastro foi aprovado!");
    }
}
