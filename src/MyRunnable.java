// This class represents a runnable object that will be executed in a thread
public class MyRunnable implements Runnable {
    // Implement the run method of Runnable interface
    public void run() {
        // Get the singleton instance
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        // Print the hash code of the singleton instance
        System.out.println("Singleton hash code: " + singleton.hashCode());
    }
}