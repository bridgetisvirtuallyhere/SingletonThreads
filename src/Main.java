// This is the main class that starts the application
public class Main {
    public static void main(String[] args) {
        // Number of threads to create
        int numThreads = 10;
        // Loop to create and start threads
        for (int i = 0; i < numThreads; i++) {
            // Create a new thread with MyRunnable object as argument
            Thread myThread = new Thread(new MyRunnable());
            // Start the thread
            myThread.start();
        }
    }
}


