import lombok.Data;

@Data
public class Client {
    public String name;

    public Client(String name) {
        this.name = name;
    }

}