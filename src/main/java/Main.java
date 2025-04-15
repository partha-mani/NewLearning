import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount("Alice", "SA123", 1000.0);

        myAccount.displayAccountType(); // Polymorphism
        System.out.println("Account Holder: " + myAccount.getAccountHolder());
        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Initial Balance: $" + myAccount.getBalance());
        Scanner input_deposit = new Scanner(System.in);
        System.out.println("Please enter the deposit amount: ");
            double deposit_amount = input_deposit.nextDouble();
        myAccount.deposit(deposit_amount);     // Interface method
        System.out.println("Current balance: " + myAccount.getBalance());
        Scanner input_withdraw = new Scanner(System.in);
        System.out.println("Please enter the withdraw amount: ");
        double withdraw_amount = input_withdraw.nextDouble();
        myAccount.withdraw(withdraw_amount);    // Interface method
        System.out.println("Final Balance: $" + myAccount.getBalance());
    }
}
