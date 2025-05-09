public class CurrencyAccount extends Account {

    public CurrencyAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("========== Conta Corrente ==========");
        commonInfos();
    }
}
