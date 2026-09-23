//Write a Java program to create a class known as BankAccount with methods called deposit() and withdraw().
// Create a subclass called SavingsAccount that overrides the withdraw() method to prevent
// withdrawals if the account balance falls below one hundred.

package Inheritance;

class BankAccount {
    private int accountNo;
    private double balance;

    BankAccount(int accountNo , double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }

   public double getBalance(){
        return balance;
   }

    void deposit(double a) {
        balance += a;
        System.out.println("Balance: " + balance);
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(int accountNo, double balance ){
        super(accountNo, balance);
    }

    double balance = getBalance();

@Override
    void withdraw(double b){
    if(balance - b >= 100){
        balance -= b;
        System.out.println("Balance after withdrawal:: " + balance);
    }else{
        System.out.println("Withdrawal denied. Minimum balance must be 100");
    }
}
}

class Task5{
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(110294, 4000);
        sa.deposit(1000);
        sa.withdraw(950);
        sa.withdraw(3000);
    }
}

