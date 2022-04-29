package my.lambda;

import java.util.function.IntConsumer;

@FunctionalInterface
interface Record {
    void play();

    default void play2() {
        System.out.println("Play2");
    }
}

@FunctionalInterface
interface Advertisement {
    void playAdd(int count);
}

@FunctionalInterface
interface Payment {
    int pay(int amount);
}

public class MusicBox {

    public MusicBox playRecord(Runnable record) {
        record.run();
        //record.play2();
        return this;
    }

    public MusicBox playAdd(IntConsumer add) {
        int count = 3;
        add.accept(count);
        return this;
    }

    public MusicBox payForMusic(Payment payment) {
        int price = 10;
        int rest = payment.pay(price);
        if (rest < 0) {
            System.out.println("Pay more $" + Math.abs(rest));
        } else {
            System.out.println("Rest is $" + rest);
        }
        return this;
    }

}