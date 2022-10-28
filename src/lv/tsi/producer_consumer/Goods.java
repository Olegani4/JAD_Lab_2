package lv.tsi.producer_consumer;

public class Goods {
    private int amount;

    public synchronized void produce(int amount) throws InterruptedException {
        this.amount = amount;
        while (this.amount <= 0) {
            wait();
        }
        notify();
    }

    public synchronized int consume() throws InterruptedException {
        while (amount <= 0) {
            wait();
        }
        int tempAmount = amount;
        amount = 0;
        notify();
        return tempAmount;
    }
}
