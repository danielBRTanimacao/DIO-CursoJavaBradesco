public class CurrencyAccount extends Account {
    // Para ser controlado pela classe 
    private static int SEQUENCIAL = 1;

    public CurrencyAccount() {
        super.agent =  Account.PATTERN_AGENT;
        super.num = SEQUENCIAL++;
    }

    @Override
    public void printExtract() {
        System.out.println("========== Conta Corrente ==========");
        communInfos();
    }
}
