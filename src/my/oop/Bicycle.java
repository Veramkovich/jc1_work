package my.oop;

import my.Version;

import java.util.Comparator;

public class Bicycle extends Machine implements Movable, Stoppable, Comparator {

    @Override
    public int compare(@Version(number = "1") Object o1, Object o2) {
        return 0;
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving...");
    }

    public void stop() {
        System.out.println("Bicycle stopped");
    }

    @Override
    public void work() {
        System.out.println("Bicyle is working");
    }

    @SuppressWarnings("deprecation")
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
