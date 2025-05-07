// Uma interface em Java é uma coleção de métodos abstratos 
// (métodos sem implementação) que servem como um contrato para as 
// classes que a implementam
public interface InterfaceAccount {
    void printExtract();

    void withdrawn(double value);

    void deposit(double value);

    // Pequeno uso polimorfismo herança
    void transfer(double value, Account accountDestiny);
}
