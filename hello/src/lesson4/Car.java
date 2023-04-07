package lesson4;

import java.awt.*;

public class Car {

    Car(int price) {
        System.out.println(price);
    }

    Color color;
    String model;

    public int compareTo(Car car) {
        return (color.getRGB() - car.color.getRGB())
                + model.compareTo(car.model);
    }

    public static void main(String[] args) {
        Car bmwX6, audiA8;

        bmwX6 = new Car(200_000);
        bmwX6.color = Color.BLUE;
        bmwX6.model = "BMW X6";

        Car bmwSecond;
        bmwSecond = bmwX6;
        //bmwX6 = null;
        System.out.println(bmwSecond.model + " " + bmwSecond.color);
        System.out.println(bmwX6.model + " " + bmwX6.color);


        audiA8 = new Car(150_000);
        audiA8.color = Color.ORANGE;
        audiA8.model = "AUDI A8";

    }
}
