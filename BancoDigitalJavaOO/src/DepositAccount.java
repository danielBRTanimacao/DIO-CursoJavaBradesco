public class DepositAccount extends Account{

    public DepositAccount(Client client, Bank bank) {
        super(client, bank);
    }

    @Override
    public void printExtract() {
        System.out.println("========== Conta Poupança ==========");
        commonInfos();
    }
}
