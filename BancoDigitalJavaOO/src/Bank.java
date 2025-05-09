import lombok.Data;

import java.util.List;

@Data
public class Bank {
    String name;
    List<Client> clients;

    public Bank(String name) {
        this.name = name;
    }
}
