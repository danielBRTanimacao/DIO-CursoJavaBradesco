public class App {
    public static void main(String[] args) {
        Bank brazil = new Bank("Brasil");
        Bank itau = new Bank("Itau");

        Client cleitin = new Client("Cleitin do grau");
        Client cabaQueMoraLogoAli = new Client("Caba que mora logo ali");

        Account ca = new CurrencyAccount(cleitin, brazil);
        Account da = new DepositAccount(cleitin, brazil);

        Account da2 = new DepositAccount(cabaQueMoraLogoAli, itau);
        da2.printExtract();

        ca.printExtract();
        da.printExtract();

        da2.deposit(20);
        da2.transfer(10, da);

        da.printExtract();

        System.out.println(brazil.getClients());
    }
}
