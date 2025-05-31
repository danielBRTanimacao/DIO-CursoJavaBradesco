package scopes_singletom_prototype.appScopes.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SistemaMessages {
    @Autowired
    private Remetente noreply;
    @Autowired
    private Remetente techTeam;

    public void enviarConfirmacaoCadastro() {
        System.out.println(noreply);
        System.out.println("Seu cadastro foi aprovado com sucesso!");
    }

    public void enviarMensagemBoasVindas() {
        techTeam.setEmail("teste@gmail.com");
        System.out.println(techTeam);
        System.out.println("Bem vindo a Mensagem do Sistema!");
    }
}
