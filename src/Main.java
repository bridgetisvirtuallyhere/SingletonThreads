public class Main {
    public static void main(String[] args) {
        int numThreads = 3;
        for (int i = 0; i < numThreads; i++) {
            Thread myThread = new Thread(new MyRunnable());
            myThread.start();
        }
    }
}



