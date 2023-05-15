package lesson17;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {

    private static Warehouse warehouse = new Warehouse();
    private final List<String> goods = new ArrayList<>();

    private Warehouse() {
    }

    public static Warehouse getInstance() {
        return warehouse;
    }

    public void addGood(String s) {
        synchronized (goods) {
            while (goods.size() >= 5) {
                try {
                    goods.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            goods.notifyAll();
            goods.add(s);
            System.out.println(Thread.currentThread().getName() + " adds " + s + ". Have [" + goods.size() + "]");
        }
    }


    public String takeGood() {
        synchronized (goods) {
            while (goods.size() == 0) {
                try {
                    goods.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            goods.notifyAll();
            String s = goods.remove(0);
            System.out.println(Thread.currentThread().getName() + " takes " + s + ". Have [" + goods.size() + "]");
            return s;
        }
    }

}
