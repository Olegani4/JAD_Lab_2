package lv.tsi.queue;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingMain {

    public static void main(String[] args) {
        final BlockingQueue<String> queue = new ArrayBlockingQueue<>(64);
        Thread addThread = new AddingThread(queue);
        Thread takeThread = new TakingThread(queue);

        addThread.start();
        takeThread.start();
        // AddingThread pushes 3 elements to the queue from
        // first thread and TakingThread takes the first added
        // element from the queue to second thread.
    }
}
