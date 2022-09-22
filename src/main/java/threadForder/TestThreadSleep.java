package threadForder;

import java.time.LocalDateTime;

public class TestThreadSleep {
    static class Task extends Thread {
        @Override
        public void run() {
            System.out.println("[ " + LocalDateTime.now() + " ] " +
                    Thread.currentThread().getName() + ": 시작");
            while (true) {
                try {
                    System.out.println("[ " + LocalDateTime.now() + " ] " +
                            Thread.currentThread().getName() + ": 잠에 듭니다.");
                    Thread.sleep(1000);
                    System.out.println("[ " + LocalDateTime.now() + " ] " +
                            Thread.currentThread().getName() + ": 잠에서 깨어 납니다.");
                } catch (InterruptedException e) {
                    break;
                }
            }
            System.out.println("[ " + LocalDateTime.now() + " ] " +
                    Thread.currentThread().getName() + ": 종료");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Task task1 = new Task();
        task1.start();
        task1.join();
    }
}
