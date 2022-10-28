package lv.tsi.producer_consumer;

public class Consumer extends Thread {
    Goods goods;

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    public void run() {
        while (true) {
            try {
                System.out.println("Consumed: " +  goods.consume());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
