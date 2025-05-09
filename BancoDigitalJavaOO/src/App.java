public class App {
    public static void main(String[] args) {
        Account ca = new CurrencyAccount();
        Account da = new DepositAccount();

        Account da2 = new DepositAccount();

        ca.printExtract();
        da.printExtract();

        da2.deposit(20);
        da2.transfer(10, da);

        da.printExtract();
    }
}
