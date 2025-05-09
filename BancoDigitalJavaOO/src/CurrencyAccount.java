public class CurrencyAccount extends Account {

    public CurrencyAccount(Client client, Bank bank) {
        super(client, bank);

    }

    @Override
    public void printExtract() {
        System.out.println("========== Conta Corrente ==========");
        commonInfos();
    }
}
