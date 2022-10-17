package NPR.PracticeThread;

public class Main {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        RandomThread thread1 = new RandomThread(sharedData);
        SquareThread thread2 = new SquareThread(sharedData);

        thread1.start();
        thread2.start();
    }
}
