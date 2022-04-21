package my.thread;

public class UserCounter extends Thread {

    public static void main(String[] args) {
        try {
            int i = 0;
            while (i < 10000) {
                UserCounter userCounter = new UserCounter();
                userCounter.setName("userCounterThread" + i++);
                userCounter.start();
            }
            Thread.sleep(1_000);
            System.out.println("User count: " + Counter.getCounter().getUserCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        Counter counter = Counter.getCounter();
        counter.increment();
    }
}

class Counter {

    private static final Counter counter = new Counter();
    private volatile int userCount = 0;

    public static Counter getCounter() {
        return counter;
    }

    public synchronized void increment() {
        userCount++;
    }

    public synchronized int getUserCount() {
        return userCount;
    }
}
