package NPR.Week4.Part2;

public class BankAccount {
    long amount = 20000000;

    public boolean checkAccountBalance(long withDrawAmount) {

        if (withDrawAmount <= amount) {
            return true;
        }
        return false;
    }

    public void withdraw(String threadName, long withdrawAmount) {
        System.out.println(threadName + " withdrew: " + withdrawAmount);
        if (checkAccountBalance(withdrawAmount)) {

            amount -= withdrawAmount;
            System.out.println(threadName + " withdrew " + withdrawAmount + " successfully");
        } else {
            System.out.println(threadName + " withdrew " + withdrawAmount + " fail");
        }
        System.out.println(threadName + " sees balance: " + amount);
    }

}
