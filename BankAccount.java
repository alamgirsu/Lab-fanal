
package extraabstraction3;

abstract class BankAccount {
    private String accNo;
    private double balance;

    public BankAccount(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public double getBalance() { return balance; }
    protected void setBalance(double balance) { this.balance = balance; }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Savings Deposit: " + amount);
    }

    void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Savings Withdraw: " + amount);
        } else System.out.println("Not enough balance");
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(String accNo, double balance) {
        super(accNo, balance);
    }

    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Current Deposit: " + amount);
    }

    void withdraw(double amount) {
        if (getBalance() >= amount) {
            setBalance(getBalance() - amount);
            System.out.println("Current Withdraw: " + amount);
        } else System.out.println("Not enough balance");
    }
}
class Main {
    public static void main(String[] args) {

        SavingsAccount s = new SavingsAccount("S101", 5000);
        s.deposit(1000);
        s.withdraw(2000);

        CurrentAccount c = new CurrentAccount("C202", 3000);
        c.deposit(500);
        c.withdraw(4000);
    }
}