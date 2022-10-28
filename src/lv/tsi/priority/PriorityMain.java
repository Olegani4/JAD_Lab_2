package lv.tsi.priority;

public class PriorityMain {

    public static void main(String[] args) {
        Thread minThread = new PriorityThread("minThread");
        Thread maxThread = new PriorityThread("maxThread");
        Thread normThread = new PriorityThread("normThread");

        minThread.setPriority(Thread.MIN_PRIORITY);
        maxThread.setPriority(Thread.MAX_PRIORITY);
        normThread.setPriority(Thread.NORM_PRIORITY);

        minThread.start();
        maxThread.start();
        normThread.start();
    }
}
