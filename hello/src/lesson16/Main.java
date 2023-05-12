package lesson16;

import java.awt.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        CoffeeBean coffeeBean = new CoffeeBean();
        coffeeBean.setFried(true);
        coffeeBean.setColor(Color.BLACK);
        coffeeBean.setHumidity(10.0);
        coffeeBean.setOriginFrom("Java");
        coffeeBean.setSort("Arabica");
        coffeeBean.setWeight(2);
        System.out.println(coffeeBean);

        // Write object to file
        String destFileName = System.getProperty("user.home") + File.separator + "coffee_bean.dat";
        System.out.println("Save to " + destFileName);
        boolean result = new CoffeeBeanWriter().writeToFile(coffeeBean, destFileName);
        if (result) {
            System.out.println("Saved coffee bean to file successfully");
        } else {
            System.out.println("Saved coffee bean to file failure");
        }

        //Read object from file

    }

}
