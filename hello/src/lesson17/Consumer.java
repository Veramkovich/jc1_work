package lesson17;

public class Consumer extends Thread {

    public Consumer() {
        super("Consumer");
    }

    @Override
    public void run() {
        Warehouse warehouse = Warehouse.getInstance();
        while (true) {
            warehouse.takeGood();
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
