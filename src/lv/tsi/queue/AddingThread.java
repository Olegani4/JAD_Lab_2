package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class AddingThread extends Thread {
    private BlockingQueue queue;

    public AddingThread(BlockingQueue queue) {
        this.queue = queue;
    }

    public void run() {
        for (int i = 1; i <= 3; i++) {
            queue.add("Element" + i);
            System.out.println("Element" + i + " has been added to the queue.");
        }
    }
}
