package lesson16.reader;

import java.io.File;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        final Map properties = System.getProperties();
        for (Object key : properties.keySet()) {
            System.out.println(key + "=" + properties.get(key));
        }

        String sourceFileName = System.getProperty("user.home") + File.separator + "coffee_bean.dat";
        System.out.println("Read from " + sourceFileName);
        Object obj = new CoffeeBeanReader().readFromFile("coffee_bean.dat");
        System.out.println(obj);
    }
}
