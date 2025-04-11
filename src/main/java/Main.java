public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Alice", "SA123", 1000.0);

        myAccount.displayAccountType(); // Polymorphism
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());

        myAccount.deposit(500);     // Interface method
        myAccount.withdraw(200);    // Interface method
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
