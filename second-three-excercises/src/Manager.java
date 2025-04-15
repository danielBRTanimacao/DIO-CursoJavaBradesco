public class Manager extends User {
    final Boolean ISADMIN = true;

    public Manager(String name, String email, String password) {
        super(name, email, password);
    }

    public void getInfos() {
        System.out.println(
            "Nome: " + this.name + 
            "\nEmail: " + this.email + 
            "\nAdmin: " + (this.ISADMIN ? "Sim" : "Não")
        );
    }

    public void generateReport() {

    }

    public void getSells() {

    }
    
}
