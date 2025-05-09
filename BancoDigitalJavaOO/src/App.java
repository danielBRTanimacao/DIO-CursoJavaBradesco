public class App {
    public static void main(String[] args) {
        Client cleitin = new Client("Cleitin do grau");
        Client cabaQueMoraLogoAli = new Client("Caba que mora logo ali");

        Account ca = new CurrencyAccount(cleitin);
        Account da = new DepositAccount(cleitin);

        Account da2 = new DepositAccount(cabaQueMoraLogoAli);
        da2.printExtract();

        ca.printExtract();
        da.printExtract();

        da2.deposit(20);
        da2.transfer(10, da);

        da.printExtract();
    }
}
