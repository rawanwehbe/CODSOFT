public class Main {
    public static void main(String[] args) {
        UserBankAccount myAccount = new UserBankAccount(0.0);
        AtmMachine atmMachine = new AtmMachine(myAccount);

        atmMachine.manageAccountTransaction();
    }
}