package lesson17;

public class Producer extends Thread {

    public Producer() {
        super("Producer");
    }

    @Override
    public void run() {
        Warehouse warehouse = Warehouse.getInstance();
        for (int i = 0; i < 10; i++) {
            warehouse.addGood("Product" + i);
            try {
                Thread.sleep(2_000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
