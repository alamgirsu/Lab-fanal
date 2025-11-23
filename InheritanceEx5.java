
public class InheritanceEx5 {
    public static void main(String[] args) {
        SavingsAccount myAccount = new SavingsAccount(500.0);
        System.out.println("Initial Balance: " + myAccount.getBalance()); 
        
        System.out.print("Withdraw 300: ");
        myAccount.withdraw(300.0); 
        System.out.println("Current Balance: " + myAccount.getBalance()); 
        
        System.out.print("Withdraw 150: ");
        myAccount.withdraw(150.0); 
        System.out.println("Current Balance: " + myAccount.getBalance());
    }
}

class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal failed: Insufficient funds.");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    private static final double MIN_BALANCE = 100.0;

    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount < MIN_BALANCE) {
            System.out.println("Withdrawal failed: Balance must not fall below " + MIN_BALANCE);
        } else {
            super.withdraw(amount);
        }
    }
}