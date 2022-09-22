import threadForder.ExtendedThread;

public class TestExtendedJava {
    public static void main(String[] args) {
        ExtendedThread thread1 = new ExtendedThread("One");
        ExtendedThread thread2 = new ExtendedThread("Two");
        ExtendedThread thread3 = new ExtendedThread("Three");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
