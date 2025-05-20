package daniel.app.Beans;

import com.google.gson.Gson;
import daniel.app.ConversorJson;
import daniel.app.ViaCepResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansFactory {
    @Bean
    public CommandLineRunner run(ConversorJson conversor) throws Exception {
        return args -> {
            String json = "";
            ViaCepResponse response = conversor.converter(json);
            System.out.println("Dados do CEP: " + response);
        };
    }

    @Bean
    public Gson gson(){
        return new Gson();
    }
}
