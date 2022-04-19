package my.thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Worker implements Runnable {

    public static void main(String[] args) {
        final ScheduledExecutorService executorService =
                Executors.newScheduledThreadPool(5);
        executorService.scheduleAtFixedRate(new Worker(), 2, 60, TimeUnit.SECONDS);
        executorService.schedule(new Worker(), 20, TimeUnit.SECONDS);

    }

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + ": working");
    }
}
