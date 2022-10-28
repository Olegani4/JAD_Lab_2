package lv.tsi.producer_consumer;

import java.util.Random;

public class Producer extends Thread {
    Goods goods;

    public Producer(Goods goods) {
        this.goods = goods;
    }

    public void run() {
        Random rand = new Random();
        while (true) {
            try {
                int randNum = rand.nextInt(1, 100000);
                goods.produce(randNum);
                System.out.println("Produced: " + randNum);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
