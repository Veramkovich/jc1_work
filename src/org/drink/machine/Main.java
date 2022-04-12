package org.drink.machine;

public class Main {

    public static void main(String[] args) {
        try {
            DrinkAutomat drinkAutomat = new DrinkAutomat();
            drinkAutomat.work();
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }
        System.exit(0);
    }

}
