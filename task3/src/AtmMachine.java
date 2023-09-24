import java.util.Scanner;

public class AtmMachine implements IAtmMachine {
    private UserBankAccount account;
    private Scanner scan;

    public AtmMachine(UserBankAccount account) {
        this.account = account;
        scan = new Scanner(System.in);
    }

    @Override
    public boolean withdraw(double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            return true;
        } else {
            return false;
        }
    }

    private void processWithdrawTransaction() {
        double amount = takeUserInput("enter the amount to withdraw: ");
        withdraw(amount);
        System.out.println("withdraw done");
    }

    @Override
    public void deposit(double amount) {
        account.setBalance(account.getBalance() + amount);
    }

    private void processDepositTransaction() {
        double amount = takeUserInput("Enter the amount to deposit: ");
        deposit(amount);
        System.out.println("deposit done");
    }

    @Override
    public double checkBalance() {
        return account.getBalance();
    }

    private void processTransaction(int choice) {
        if (choice == 1) {
            AtmTransactionsReporter.displayBalance(checkBalance());
        } else if (choice == 2) {
            processDepositTransaction();
            AtmTransactionsReporter.displayBalance(checkBalance());
        } else if (choice == 3) {
            processWithdrawTransaction();
            AtmTransactionsReporter.displayBalance(checkBalance());
        } else if (choice == 4) {
            AtmTransactionsReporter.displayEnd();
        } else {
            AtmTransactionsReporter.displayTryAgain();
        }
    }

    public void manageAccountTransaction() {
        while (true) {
            AtmTransactionsReporter.displayMenu();

            int choice = scan.nextInt();

            processTransaction(choice);
            AtmTransactionsReporter.displayBreakLine();

            if (choice == 4) {
                return;
            }
        }
    }

    private double takeUserInput(String type) {
        System.out.println(type);
        double amount = scan.nextDouble();
        return amount;
    }
}