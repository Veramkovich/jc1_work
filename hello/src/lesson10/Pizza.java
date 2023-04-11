package lesson10;

import java.io.Serializable;
import java.util.Arrays;

public class Pizza implements Serializable {

    private int size;
    private double weight;
    private float temperature;
    private char[] name;
    private String[] components;

    public Pizza() {
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getTemperature() {
        return temperature;
    }

    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }

    public String getName() {
        return new String(name);
    }

    public void setName(String name) {
        this.name = name.toCharArray();
    }

    public String[] getComponents() {
        return components;
    }

    public void setComponents(String[] components) {
        this.components = components;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pizza pizza = (Pizza) o;

        if (size != pizza.size) return false;
        if (Double.compare(pizza.weight, weight) != 0) return false;
        if (Float.compare(pizza.temperature, temperature) != 0) return false;
        if (!name.equals(pizza.name)) return false;
        // Probably incorrect - comparing Object[] arrays with Arrays.equals
        return Arrays.equals(components, pizza.components);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = size;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (temperature != +0.0f ? Float.floatToIntBits(temperature) : 0);
        result = 31 * result + name.hashCode();
        result = 31 * result + Arrays.hashCode(components);
        return result;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", weight=" + weight +
                ", temperature=" + temperature +
                ", name='" + name + '\'' +
                ", components=" + Arrays.toString(components) +
                '}';
    }
}
