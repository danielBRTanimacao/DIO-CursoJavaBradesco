// Abstract garante que não vai se chamada na new 
// implements interface salva os metodos publicos para serem obrigatorios implementados

import java.util.Random;

public abstract class Account implements InterfaceAccount {
    static Random random = new Random();
    private static final int PATTERN_AGENT = random.nextInt(100);
    // Para ser controlado pela classe
    private static int SEQUENTIAL = 1;

    // utilizando protect para ter a interação com a classe filho
    protected int agent;
    protected int num;
    protected double amount;
    protected  Client client;
    protected  Bank bank;

    public Account(Client client, Bank bank) {
        this.bank = bank;
        this.client = client;
        this.agent =  Account.PATTERN_AGENT;
        this.num = SEQUENTIAL++;
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
        accountDestiny.deposit(value);
    }

    protected void commonInfos() {
        System.out.println("Banco " + this.bank.getName());
        System.out.println("Usuario " + this.client.getName());
        System.out.println("Agente " + this.agent);
        System.out.println("Número da conta " + this.num);
        System.out.println("Saldo " + String.format("%.2f", this.amount));
    }
}
