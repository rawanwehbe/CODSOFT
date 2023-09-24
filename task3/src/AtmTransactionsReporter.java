public class AtmTransactionsReporter {
    public static void displayBreakLine() {
        System.out.println("---------------");
    }

    public static void displayMenu() {
        System.out.println("Welcome to ATM");
        System.out.println("1.check balance\n2.deposit\n3.withdraw\n4.exit\nenter choice: ");
    }

    public static void displayBalance(double balance) {
        System.out.println("your balance is: " + balance);
    }

    public static void displayEnd() {
        System.out.println("thank you for using our machine");
    }

    public static void displayTryAgain() {
        System.out.println("Invalid choice!try again");
    }
}
