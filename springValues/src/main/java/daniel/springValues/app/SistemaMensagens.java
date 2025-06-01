package daniel.springValues.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class SistemaMensagens implements CommandLineRunner {
    private String name = "Cleitin do grau";
    private String email = "cleitindograu@gmail.com";
    private List<Long> phones = new ArrayList<>();

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "Mensagem enviada por: " + this.name
                + "\nEmail: " + this.email
                + "\nCom telefones para contato: " + this.phones);
        System.out.println("Seu cadastro foi aprovado!");
    }
}
