package NPR.PracticeThread;

import java.util.Random;

public class SquareThread extends Thread {
    private SharedData sharedData;

    public SquareThread (SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                try {
                    sharedData.notifyAll();
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                int randomNum = sharedData.getData();
                randomNum = randomNum * randomNum;
                System.out.println("BP: " + randomNum);
            }

        }
    }
}
