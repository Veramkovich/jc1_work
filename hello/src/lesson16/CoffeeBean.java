package lesson16;

import java.awt.*;
import java.io.Serializable;

public class CoffeeBean implements Serializable {

    private String sort;

    private int weight;

    private Color color;

    private String originFrom;

    private double humidity;

    private boolean isFried;

    public CoffeeBean() {
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getOriginFrom() {
        return originFrom;
    }

    public void setOriginFrom(String originFrom) {
        this.originFrom = originFrom;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public boolean isFried() {
        return isFried;
    }

    public void setFried(boolean fried) {
        isFried = fried;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoffeeBean that = (CoffeeBean) o;

        if (weight != that.weight) return false;
        if (Double.compare(that.humidity, humidity) != 0) return false;
        if (isFried != that.isFried) return false;
        if (!sort.equals(that.sort)) return false;
        if (!color.equals(that.color)) return false;
        return originFrom.equals(that.originFrom);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = sort.hashCode();
        result = 31 * result + weight;
        result = 31 * result + color.hashCode();
        result = 31 * result + originFrom.hashCode();
        temp = Double.doubleToLongBits(humidity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (isFried ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CoffeeBean{" +
                "sort='" + sort + '\'' +
                ", weight=" + weight +
                ", color=" + color +
                ", originFrom='" + originFrom + '\'' +
                ", humidity=" + humidity +
                ", isFried=" + isFried +
                '}';
    }
}
