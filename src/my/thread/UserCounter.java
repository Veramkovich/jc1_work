package my.thread;

public class UserCounter extends Thread {

    public static void main(String[] args) {
        try {
            int i = 0;
            while (i < 100) {
                UserCounter userCounter = new UserCounter();
                userCounter.setName("userCounterThread" + i++);
                userCounter.start();
            }
            Thread.sleep(10_000);
            System.out.println("User count: " + Counter.getCounter().getUserCount());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        Counter.getCounter().increment();
    }
}

class Counter {

    private static Counter counter;
    private int userCount = 0;

    public static Counter getCounter() {
        if (counter == null) {
            counter = new Counter();
        }
        return counter;
    }

    public synchronized void increment() {
        userCount++;
    }

    public synchronized int getUserCount() {
        return userCount;
    }
}
