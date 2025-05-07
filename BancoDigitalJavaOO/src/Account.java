// Abstract garante que não vai se chamada na new 
// implements interface salva os metodos publicos para serem obrigatorios implementados

import java.util.Random;

public abstract class Account implements InterfaceAccount {
    static Random random = new Random();
    protected static int PATTERN_AGENT = random.nextInt(100);

    // utilizando protect para ter a interação com a classe filho
    protected int agent;
    protected int num;
    private double amount;

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

    protected void communInfos() {
        System.out.println("Agente " + this.agent);
        System.out.println("Número da conta " + this.num);
        System.out.println("Saldo " + String.format("%.2f", this.amount));
    }
}
