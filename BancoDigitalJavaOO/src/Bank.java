import java.util.List;

public class Bank {
    String name;
    List<Client> clients;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Client> getClients() {
        return clients;
    }

}
