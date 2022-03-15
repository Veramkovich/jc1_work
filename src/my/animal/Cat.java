package my.animal;

import my.plant.Rose;

public class Cat {

    public String s1;
    protected String s2;
    private String s3;
    String s4;


    //private String color;
    private char[] color;

    public Cat(String catColor) {
        color = catColor.toCharArray();
        washFace();
    }

    public final String getColor() {
        return new String(color);
    }

    public final void setColor(String color) {
        if (color == null) {
            System.out.println("Not valid value");
        }
        this.color = color.toCharArray();
    }

    final Rose getFavoriteFlower() {
        return new Rose("red");
    }

    private void washFace() {
        System.out.println("Wash face");
    }

}
