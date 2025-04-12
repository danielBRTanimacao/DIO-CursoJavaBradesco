package utils;

public class Bank {
    String user;
    double salary;
    double amount;
    double credit;

    public Bank(String username, double salary) {
        this.user = username;
        this.salary = salary;
        this.credit = salary / 2;
    }

    public double getAmount() {
        return amount;
    }

    public double getCredit() {
        return credit;
    }

    public void makeDeposit(double value) {
        amount += value;
        System.out.println("Você depositou R$" + String.format("%.2f", value));
    }

    public void makeWithdrawn(double value) {
        if (value > amount) {
            System.out.println("Você Não pode retirar R$" + String.format("%.2f", value));
        } else {
            amount =- value;
            System.out.println("Você retirou R$" + String.format("%.2f", value));
        }
    }

    public void chooseDivision(double buy, int divisor) {
        double installments = buy / divisor;
        System.out.println("Sua compra R$" + String.format("%.2f", buy) + "\nFoi dividade em " + installments + "x");
    }
}
