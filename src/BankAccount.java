public class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }

    public void deposit(double amount) {
        setBalance(balance + amount);
    }

    public void withdraw(double amount){
           setBalance(balance - amount);
    }

    public double getBalance() {
        return balance;
    }

    private void setBalance(double balance) {
        if (balance > 0 ) {
            this.balance = balance;
        }
    }
}
