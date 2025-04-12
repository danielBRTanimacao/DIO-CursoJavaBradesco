import utils.Bank;

public class Ex03Abstraction {
    public static void main(String[] args) {
        Bank user = new Bank("Daniel", 1200);
        user.makeDeposit(25);
        user.makeDeposit(5);
        System.out.println("R$" + String.format("%.2f", user.getAmount()));
        System.out.println("Credito disponivel R$" + String.format("%.2f", user.getCredit()));
        user.makeWithdrawn(5);
        user.chooseDivision(300,10);
    }
}
