public class App {
    public static void main(String[] args) {
        Account ca = new CurrencyAccount();
        Account da = new DepositAccount();

        ca.printExtract();
        da.printExtract();
    }
}
