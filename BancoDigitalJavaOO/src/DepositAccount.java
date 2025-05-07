public class DepositAccount extends Account{

    @Override
    public void printExtract() {
        System.out.println("========== Conta Poupança ==========");
        commonInfos();
    }
}
