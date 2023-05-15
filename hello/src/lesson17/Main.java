package lesson17;

public class Main {

    public static void main(String[] args) {

        System.out.println("My current thread: " + Thread.currentThread().getName());

        HelloThread helloThread = new HelloThread("HelloWorld1");
        System.out.println("State of HelloWorld1: " + helloThread.getState());
        helloThread.start(); //new thread started
        helloThread.run(); //error
        System.out.println("State of HelloWorld1: " + helloThread.getState());

        new HelloThread("HelloWorld2").start();
    }
}

class HelloThread extends Thread {

    public HelloThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("From run() - my current thread: " + Thread.currentThread().getName());
    }
}