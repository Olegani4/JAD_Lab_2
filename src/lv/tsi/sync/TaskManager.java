package lv.tsi.sync;

public class TaskManager {

    // The difference of synchronized method with not is that
    // the others threads don't disturb the first one or others
    // threads. So, synchronization gives to method to be executed
    // fully once and after to go to execution of method of next thread.
    public synchronized void performTask(int TaskId) {
        System.out.println("Current thread name: " + Thread.currentThread().getName() + "; Task Id: " + TaskId);
        try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Current thread name: " + Thread.currentThread().getName() + "; Task Id: " + TaskId);
    }
}