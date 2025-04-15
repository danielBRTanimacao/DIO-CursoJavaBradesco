public class Attendant extends User{
    double boxValue = 0;
    final boolean ISADMIN = false;

    public Attendant(String name, String email, String password) {
        super(name, email, password);
    }

    public void getInfos() {
        System.out.println(
            "Nome: " + this.name + 
            "\nEmail: " + this.email + 
            "\nAdmin: " + (this.ISADMIN ? "Sim" : "Não") +
            "\nValor do caixa: R$" + String.format("%.2f", this.boxValue)
        );
    }
    
}
