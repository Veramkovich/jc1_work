package lesson11;


import java.io.Serializable;

public class BmwX6 extends Machine implements CarDriving, Serializable {

    public BmwX6() {
        this("BMW X6");
    }

    public BmwX6(String brand) {
        setBrandName(brand);
        // ...
    }

    @Override
    public void startEngine() {
        startEngine("", 0, false);
    }

    // Method overloading
    public void startEngine(String key) {
        startEngine(key, 0, false);
    }

    public void startEngine(String key, int delay, boolean remote) {
        System.out.print(getBrandName() + " start engine");
        if (key != null && !key.equals("")) {
            System.out.print(" with " + key);
        }
        if (delay != 0) {
            System.out.print(" delay " + delay);
        }
        if (remote) {
            System.out.println(" remotely");
        }
        System.out.println();
    }


    @Override
    public int drive(int distance) {
        System.out.println(getBrandName() + "  ");
        return 0;
    }


}
