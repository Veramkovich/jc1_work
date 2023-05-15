package lesson17;

public class MainWarehouseApp {

    public static void main(String[] args) {
        new Producer().start();
        new Consumer().start();
    }
}
