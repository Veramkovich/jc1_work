package lesson18;

import java.util.Date;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MyExecutor {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        String s = "Hello from Thread ";
        System.out.println(s + Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        //s = new String("test");
        final Future<Date> future = executorService.submit(() -> {
            Date date = new Date();
            System.out.println(date);
            System.out.println(s + Thread.currentThread().getName());
            //s = new String("test");
            return date;
        });

        Date dateFromFuture = future.get();
        System.out.println("Date from future: " + dateFromFuture);


        executorService.shutdown();
    }

}

