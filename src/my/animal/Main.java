package my.animal;

//import java.lang.*;

import my.plant.MyString;
import my.plant.Rose;

public class Main {


    public static final void main(String[] args) {
        final Cat c = new Cat("black");
        System.out.println(c.s1);
        System.out.println(c.s2);
        //System.out.println(c.s3); cannot access private
        System.out.println(c.s4);

        //c = new Cat("white"); ERROR cannot change final variable
        System.out.println(c.getColor());
        String s1 = c.getColor();
        s1 = "white";
        System.out.println(c.getColor()); // ????

        Rose rose = c.getFavoriteFlower();
        rose.isPlant();
        Rose.isPlant();

        Rose rose2 = new Rose("yellow");
        rose2.isPlant();

        //System.out.println(rose.s1); //only public
        //System.out.println(rose.s2);
        //System.out.println(rose.s3);
        //System.out.println(rose.s4);
        Rose rose3 = new Rose("white");

        String s = rose.toString();
        MyString myString = new MyString();

        System.out.println("I create " + Rose.getObjectCounter() + " roses");



    }

}
