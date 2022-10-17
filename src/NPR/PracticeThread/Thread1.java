package NPR.PracticeThread;

public class Thread1 extends Thread {
    private String name;
    private BankAccount bankAccount;

    public Thread1(String name, BankAccount bankAccount) {
        this.name = name;
        this.bankAccount = bankAccount;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (bankAccount) {

            }
        }
    }
}
