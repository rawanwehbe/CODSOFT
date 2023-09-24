import java.util.Scanner;

public class UserBankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public UserBankAccount(double balance) {
        this.balance = balance;
    }
}
