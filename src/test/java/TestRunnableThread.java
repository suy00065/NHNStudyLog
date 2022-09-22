import threadForder.RunnableThread;

public class TestRunnableThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableThread("One"));
        Thread thread2 = new Thread(new RunnableThread("Two"));
        Thread thread3 = new Thread(new RunnableThread("Three"));

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
