//Write a Java program to create an abstract class BankAccount with abstract methods deposit() and withdraw().
// Create subclasses: SavingsAccount and CurrentAccount that extend the BankAccount class and
// implement the respective methods to handle deposits and withdrawals for each account type.

package Abstraction;

abstract class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }

    protected void setBalance(double balance) {
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {

    public SavingsAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Balance after deposit = " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= 100) {
            setBalance(getBalance() - amount);
            System.out.println("Balance after withdraw = " + getBalance());
        } else {
            System.out.println("Limit exceeded!");
        }
    }
}

class CurrentAccount extends BankAccount {

    public CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    public void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Balance after deposit = " + getBalance());
    }

    @Override
    public void withdraw(double amount) {
        setBalance(getBalance() - amount);
        System.out.println("Balance after withdraw = " + getBalance());
    }
}

class Task3 {
    public static void main(String[] args) {

        BankAccount A = new SavingsAccount(1000);
        BankAccount B = new CurrentAccount(1000);

        A.withdraw(900);
        B.withdraw(950);
    }
}