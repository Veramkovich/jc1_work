package lesson7;

public class DrinkProduct extends Product {

    double volume;

    public DrinkProduct(String s, int i) {
        super(s, i);
    }

    public DrinkProduct(String s, int i, double volume) {
        super(s, i);
        this.volume = volume;
    }
}
