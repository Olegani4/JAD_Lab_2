package lv.tsi.queue;

import java.util.concurrent.BlockingQueue;

public class TakingThread extends Thread {
    private BlockingQueue blockQueue;

    public TakingThread(BlockingQueue blockQueue) {
        this.blockQueue = blockQueue;
    }

    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("Taken element from the queue: " + blockQueue.take());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
