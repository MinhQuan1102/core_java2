package NPR.PracticeThread;

import java.util.Random;

public class RandomThread extends Thread{
    private SharedData sharedData;

    public RandomThread (SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            synchronized (sharedData) {
                int randomNum = random.nextInt(100) + 1;
                sharedData.setData(randomNum);
                System.out.println("Random number: " + randomNum);
                sharedData.notifyAll();
                try {
                    sharedData.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }
}
