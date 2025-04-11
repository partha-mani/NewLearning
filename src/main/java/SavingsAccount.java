public class SavingsAccount extends Account {

    public SavingsAccount(String holder, String accNum, double bal) {
        super(holder, accNum, bal);
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        }
    }

    @Override
    public void displayAccountType() {
        System.out.println("Account Type: Savings");
    }
}
