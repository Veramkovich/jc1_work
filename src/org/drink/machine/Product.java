package org.drink.machine;

import java.io.Serializable;

public class Product implements Countable, Serializable {

    final private String name;
    final private double price;
    private int count;

    public Product(String name, double price) {
        this(name, price, 0);
    }

    public Product(String name, double price, int count) {
        this.name = name;
        this.price = price;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getCount() {
        return count;
    }

    public void decreaseCount() {
        count--;
    }

}
