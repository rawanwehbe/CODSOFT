public interface IAtmMachine {
    boolean withdraw(double amount);
    void deposit(double amount);
    double checkBalance();
}
