public class MyRunnable implements Runnable {
    public void run() {
        LazyInitializedSingleton singleton = LazyInitializedSingleton.getInstance();
        System.out.println("Singleton hash code: " + singleton.hashCode());
    }
}
