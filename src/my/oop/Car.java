package my.oop;

public class Car extends Machine implements Movable, Breakable {

    public Car() {
        super();
        System.out.println("Created a new car");
    }

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("Car is moving...");
    }

    @Override
    public void doBreak() {
        System.out.println("Car stopped");
    }

    @Override
    public void work() {
        System.out.println("Car is working");
    }

    @Override
    public void stop(int sec) {
        System.out.println("Car stops in " + sec + " sec");
    }

    public static void main(String[] args) {
        Machine car = new Car();
        Machine bicycle = new Bicycle();
        car.stop(10);
        bicycle.stop(10);
        Movable movable = new Car("BMW");
        movable.doSomething();
    }

}
