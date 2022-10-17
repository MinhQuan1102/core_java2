package NPR.PracticeThread;

public class BankAccount {
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public void withdraw(int amount) {
        if (amount > this.getBalance()) {
            System.out.println("You do not have enough money to withdraw!");
        } else {
            this.balance = this.balance - amount;
        }
    }

    public void checkBalance() {
        System.out.println("Current balance: " + this.balance);
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
