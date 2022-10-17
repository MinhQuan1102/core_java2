package NPR.Week4.Part2;

public class WithdrawThread extends Thread {
    String threadName = "";
    long withdrawAmount = 0;
    BankAccount2 bankAccount;

    public WithdrawThread(String threadName, BankAccount2 bankAccount, long withdrawAmount) {
        this.threadName = threadName;
        this.bankAccount = bankAccount;
        this.withdrawAmount = withdrawAmount;
    }

    @Override
    public void run() {
        bankAccount.withdraw(threadName, withdrawAmount);
    }

    public static void main(String[] args) {
        BankAccount2 bankAccount = new BankAccount2();
        WithdrawThread husbandThread = new WithdrawThread("Husband", bankAccount, 15000000);
        husbandThread.start();
        WithdrawThread wifeThread = new WithdrawThread("Wife", bankAccount, 20000000);
        wifeThread.start();
        System.out.println("Main Thread Ends.");
    }


}
