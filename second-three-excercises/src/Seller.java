public class Seller extends User{
    int quantitySells = 0;
    final boolean ISADMIN = false;

    public Seller(String name, String email, String password) {
        super(name, email, password);
    }

    public void getInfos() {
        System.out.println(
            "Nome: " + this.name + 
            "\nEmail: " + this.email + 
            "\nAdmin: " + (this.ISADMIN ? "Sim" : "Não") +
            "\nQuantidade de vendas: " + this.quantitySells
        );
    }
    
}
