package lv.tsi.sync;

public class SyncMain {

    public static void main(String[] args) throws InterruptedException {
        final TaskManager task = new TaskManager();
        Thread thread1 = new TaskThread(1, task, "Thread 1");
        Thread thread2 = new TaskThread(2, task, "Thread 2");

        thread1.start();
        Thread.sleep(2);
        thread2.start();
    }
}
