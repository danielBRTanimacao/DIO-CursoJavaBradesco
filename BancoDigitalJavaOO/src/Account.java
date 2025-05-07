// Abstract garante que não vai se chamada na new 
// implements interface salva os metodos publicos para serem obrigatorios implementados

import java.util.Random;

public abstract class Account implements InterfaceAccount {
    static Random random = new Random();
    private static int PATTERN_AGENT = random.nextInt(100);
    // Para ser controlado pela classe
    private static int SEQUENCIAL = 1;

    // utilizando protect para ter a interação com a classe filho
    protected int agent;
    protected int num;
    private double amount;

    public Account() {
        this.agent =  Account.PATTERN_AGENT;
        this.num = SEQUENCIAL++;
    }

    @Override
    public void withdrawn(double value) {
        this.amount -= value;
    }

    @Override
    public void deposit(double value) {
        this.amount += value;
    }

    @Override
    public void transfer(double value, Account accountDestiny) {
        this.withdrawn(value);
        this.deposit(value);
    }

    protected void commonInfos() {
        System.out.println("Agente " + this.agent);
        System.out.println("Número da conta " + this.num);
        System.out.println("Saldo " + String.format("%.2f", this.amount));
    }
}
