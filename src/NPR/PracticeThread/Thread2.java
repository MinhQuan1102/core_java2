package NPR.PracticeThread;

public class Thread2 extends Thread {
    private final SharedData sharedData;

    public Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                int data = sharedData.getData();
                System.out.println("Thread 2: " + data * data);
                sharedData.notify();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
