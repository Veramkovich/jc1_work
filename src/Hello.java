import javax.swing.*;

public class Hello {

    // This is name of the man
    String nameOfTheMan = "122";
    int height = 186;
    int system = 12;

    /*
    This is main method
    of class Hello
     */
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World " + args[0]);

        Car $myCar = null;
        $myCar = new Car();

        System.out.println(new Car().getPrice());

        $myCar.setPrice(20_000_000);
        System.out.println($myCar.getPrice());
        System.out.println($myCar.getModel().length());
    }

}

class Car {

    int price;
    String model = new String();

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        System.out.println("new price=" + newPrice);
        price = newPrice;
        System.out.println("car price=" + price);
    }

    public String getModel() {
        return model;
    }

}