public class DepositAccount extends Account{

    public DepositAccount(Client client) {
        super(client);
    }

    @Override
    public void printExtract() {
        System.out.println("========== Conta Poupança ==========");
        commonInfos();
    }
}
