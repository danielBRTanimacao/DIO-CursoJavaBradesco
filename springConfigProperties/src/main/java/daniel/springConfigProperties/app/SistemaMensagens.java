package daniel.springConfigProperties.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagens implements CommandLineRunner {

    @Autowired
    private Remetente remetente;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(
                "Mensagem enviada por: " + this.remetente.getName()
                        + "\nEmail: " + this.remetente.getEmail()
                        + "\nCom telefones para contato: " + this.remetente.getPhones());
        System.out.println("Seu cadastro foi aprovado!");
    }
}