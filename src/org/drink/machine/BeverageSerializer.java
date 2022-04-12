package org.drink.machine;

import java.io.*;

public class BeverageSerializer {

    public static void serialize(Beverage beverage) {
        if (beverage == null) {
            throw new IllegalArgumentException("beverage is null");
        }
        File file = new File("beverage.dat");
        try (
                FileOutputStream fos = new FileOutputStream(file);
                ObjectOutputStream oos = new ObjectOutputStream(fos)
        ) {
            oos.writeObject(beverage);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Beverage deserialize() {
        try (
                FileInputStream fis = new FileInputStream("beverage.dat");
                ObjectInputStream ois = new ObjectInputStream(fis)
        ) {
            Object obj = ois.readObject();
            return (Beverage) obj;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Beverage test1 = new Beverage("Coca-Cola", 2.5, 1, 0.5);
        System.out.println(test1);
        System.out.println(test1.number);
        serialize(test1);

        Beverage.number = 2;

        Beverage test2 = deserialize();
        System.out.println(test2);
        System.out.println(test2.getName() + " " + test2.getPrice()
                + " " + test2.getVolume());
        System.out.println(test2.number);
    }
}
