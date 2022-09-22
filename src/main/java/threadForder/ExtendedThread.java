package threadForder;

public class ExtendedThread extends Thread{
    private String message;
    private int loopCount;
    public ExtendedThread(String message) {
        this.message = message;
        this.loopCount = 0;
    }

    @Override
    public void run() {
        while(!Thread.interrupted()) {
            try {
                ++this.loopCount;
                System.out.println(this.message + " : " + this.loopCount);
                Thread.sleep((long)(Math.random() * 1000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
