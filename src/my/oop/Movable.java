package my.oop;

public interface Movable {

    void move();

    default void doSomething(){
        System.out.println("Do something");
    }

    private static String name() {
        return "Name";
    }
}
