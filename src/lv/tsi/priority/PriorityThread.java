package lv.tsi.priority;

public class PriorityThread extends Thread {

    PriorityThread(String name) {
    super(name);
    }

    public void run() {
        PriorityThread myThread = new PriorityThread("MyThread");
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + ": " + myThread.getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
