package NPR.Week4.Part2;

public class BankAccount1 {
    private long amount = 20000000;

    public synchronized boolean checkAccountBalance(long withDrawAmount) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (withDrawAmount <= amount) {
            return true;
        }

        return false;
    }

    public synchronized void withdraw(String threadName, long withdrawAmount) {
        System.out.println(threadName + " checks: " + withdrawAmount);

        if (checkAccountBalance(withdrawAmount)) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            amount -= withdrawAmount;
            System.out.println(threadName + " withdrew successfully: " + withdrawAmount);
        } else {
            System.out.println(threadName + " withdraws error!");
        }

        System.out.println(threadName + " sees balance: " + amount);
    }

}
